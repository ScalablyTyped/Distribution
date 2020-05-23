package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/tree-item/
trait TreeItem extends js.Object {
  val collapsibleState: TreeItemCollapsibleState
  var command: js.UndefOr[js.Any] = js.undefined
   // https://dev.panic.com/panic/nova-issues/-/issues/909
  var contextValue: js.UndefOr[String] = js.undefined
  var descriptiveText: js.UndefOr[String] = js.undefined
  var identifier: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  val name: String
  var path: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object TreeItem {
  @scala.inline
  def apply(
    collapsibleState: TreeItemCollapsibleState,
    name: String,
    command: js.Any = null,
    contextValue: String = null,
    descriptiveText: String = null,
    identifier: String = null,
    image: String = null,
    path: String = null,
    tooltip: String = null
  ): TreeItem = {
    val __obj = js.Dynamic.literal(collapsibleState = collapsibleState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue.asInstanceOf[js.Any])
    if (descriptiveText != null) __obj.updateDynamic("descriptiveText")(descriptiveText.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItem]
  }
}

