package typings.officeUiFabricReact.groupedListBaseMod

import typings.officeUiFabricReact.groupedListTypesMod.IGroup
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupedListState extends js.Object {
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  var lastSelectionMode: js.UndefOr[SelectionMode] = js.native
}

object IGroupedListState {
  @scala.inline
  def apply(): IGroupedListState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupedListState]
  }
  @scala.inline
  implicit class IGroupedListStateOps[Self <: IGroupedListState] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: IGroup*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[IGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setLastSelectionMode(value: SelectionMode): Self = this.set("lastSelectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSelectionMode: Self = this.set("lastSelectionMode", js.undefined)
  }
  
}

