package typings.officeUiFabricReact.announcedQuickActionsExampleMod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnnouncedQuickActionsExampleState extends js.Object {
  var announced: js.UndefOr[Element] = js.native
  var dialogContent: js.UndefOr[Element] = js.native
  var items: js.Array[IAnnouncedQuickActionsExampleItem] = js.native
  var renameDialogOpen: Boolean = js.native
}

object IAnnouncedQuickActionsExampleState {
  @scala.inline
  def apply(items: js.Array[IAnnouncedQuickActionsExampleItem], renameDialogOpen: Boolean): IAnnouncedQuickActionsExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], renameDialogOpen = renameDialogOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedQuickActionsExampleState]
  }
  @scala.inline
  implicit class IAnnouncedQuickActionsExampleStateOps[Self <: IAnnouncedQuickActionsExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemsVarargs(value: IAnnouncedQuickActionsExampleItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[IAnnouncedQuickActionsExampleItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenameDialogOpen(value: Boolean): Self = this.set("renameDialogOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnnounced(value: Element): Self = this.set("announced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnounced: Self = this.set("announced", js.undefined)
    @scala.inline
    def setDialogContent(value: Element): Self = this.set("dialogContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogContent: Self = this.set("dialogContent", js.undefined)
  }
  
}

