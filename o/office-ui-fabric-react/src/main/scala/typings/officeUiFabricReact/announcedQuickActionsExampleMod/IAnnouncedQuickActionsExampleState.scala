package typings.officeUiFabricReact.announcedQuickActionsExampleMod

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnouncedQuickActionsExampleState extends js.Object {
  var announced: js.UndefOr[Element] = js.undefined
  var dialogContent: js.UndefOr[Element] = js.undefined
  var items: js.Array[IAnnouncedQuickActionsExampleItem]
  var renameDialogOpen: Boolean
}

object IAnnouncedQuickActionsExampleState {
  @scala.inline
  def apply(
    items: js.Array[IAnnouncedQuickActionsExampleItem],
    renameDialogOpen: Boolean,
    announced: Element = null,
    dialogContent: Element = null
  ): IAnnouncedQuickActionsExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], renameDialogOpen = renameDialogOpen.asInstanceOf[js.Any])
    if (announced != null) __obj.updateDynamic("announced")(announced.asInstanceOf[js.Any])
    if (dialogContent != null) __obj.updateDynamic("dialogContent")(dialogContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedQuickActionsExampleState]
  }
}

