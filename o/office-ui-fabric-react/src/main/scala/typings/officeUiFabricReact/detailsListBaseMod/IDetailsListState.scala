package typings.officeUiFabricReact.detailsListBaseMod

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListState extends js.Object {
  var adjustedColumns: js.Array[IColumn] = js.native
  var focusedItemIndex: Double = js.native
  var isCollapsed: js.UndefOr[Boolean] = js.native
  var isSizing: js.UndefOr[Boolean] = js.native
  var isSomeGroupExpanded: js.UndefOr[Boolean] = js.native
  var lastSelectionMode: js.UndefOr[SelectionMode] = js.native
  var lastWidth: js.UndefOr[Double] = js.native
}

object IDetailsListState {
  @scala.inline
  def apply(adjustedColumns: js.Array[IColumn], focusedItemIndex: Double): IDetailsListState = {
    val __obj = js.Dynamic.literal(adjustedColumns = adjustedColumns.asInstanceOf[js.Any], focusedItemIndex = focusedItemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListState]
  }
  @scala.inline
  implicit class IDetailsListStateOps[Self <: IDetailsListState] (val x: Self) extends AnyVal {
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
    def setAdjustedColumnsVarargs(value: IColumn*): Self = this.set("adjustedColumns", js.Array(value :_*))
    @scala.inline
    def setAdjustedColumns(value: js.Array[IColumn]): Self = this.set("adjustedColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusedItemIndex(value: Double): Self = this.set("focusedItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCollapsed(value: Boolean): Self = this.set("isCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCollapsed: Self = this.set("isCollapsed", js.undefined)
    @scala.inline
    def setIsSizing(value: Boolean): Self = this.set("isSizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSizing: Self = this.set("isSizing", js.undefined)
    @scala.inline
    def setIsSomeGroupExpanded(value: Boolean): Self = this.set("isSomeGroupExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSomeGroupExpanded: Self = this.set("isSomeGroupExpanded", js.undefined)
    @scala.inline
    def setLastSelectionMode(value: SelectionMode): Self = this.set("lastSelectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSelectionMode: Self = this.set("lastSelectionMode", js.undefined)
    @scala.inline
    def setLastWidth(value: Double): Self = this.set("lastWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastWidth: Self = this.set("lastWidth", js.undefined)
  }
  
}

