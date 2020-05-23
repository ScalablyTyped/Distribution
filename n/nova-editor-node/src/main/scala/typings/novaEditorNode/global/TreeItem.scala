package typings.novaEditorNode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/tree-item/
@JSGlobal("TreeItem")
@js.native
class TreeItem protected ()
  extends typings.novaEditorNode.TreeItem {
  def this(name: String) = this()
  def this(name: String, collapsibleState: typings.novaEditorNode.TreeItemCollapsibleState) = this()
  /* CompleteClass */
  override val collapsibleState: typings.novaEditorNode.TreeItemCollapsibleState = js.native
  /* CompleteClass */
  override val name: String = js.native
}

