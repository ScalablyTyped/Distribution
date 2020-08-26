package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableSelectCell extends js.Object {
  var checked: Boolean = js.native
  var classes: js.UndefOr[js.Object] = js.native
  var expandableOn: js.UndefOr[Boolean] = js.native
  var fixedHeader: Boolean = js.native
  var isHeaderCell: js.UndefOr[Boolean] = js.native
  var isRowExpanded: js.UndefOr[Boolean] = js.native
  var isRowSelectable: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var onExpand: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var otherProps: js.UndefOr[js.Any] = js.native
  var selectableOn: js.UndefOr[Boolean] = js.native
}

object MUIDataTableSelectCell {
  @scala.inline
  def apply(checked: Boolean, fixedHeader: Boolean): MUIDataTableSelectCell = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableSelectCell]
  }
  @scala.inline
  implicit class MUIDataTableSelectCellOps[Self <: MUIDataTableSelectCell] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setExpandableOn(value: Boolean): Self = this.set("expandableOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandableOn: Self = this.set("expandableOn", js.undefined)
    @scala.inline
    def setIsHeaderCell(value: Boolean): Self = this.set("isHeaderCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHeaderCell: Self = this.set("isHeaderCell", js.undefined)
    @scala.inline
    def setIsRowExpanded(value: Boolean): Self = this.set("isRowExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRowExpanded: Self = this.set("isRowExpanded", js.undefined)
    @scala.inline
    def setIsRowSelectable(value: Boolean): Self = this.set("isRowSelectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRowSelectable: Self = this.set("isRowSelectable", js.undefined)
    @scala.inline
    def setOnChange(value: /* args */ js.Any => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnExpand(value: /* args */ js.Any => _): Self = this.set("onExpand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    @scala.inline
    def setOtherProps(value: js.Any): Self = this.set("otherProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherProps: Self = this.set("otherProps", js.undefined)
    @scala.inline
    def setSelectableOn(value: Boolean): Self = this.set("selectableOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectableOn: Self = this.set("selectableOn", js.undefined)
  }
  
}

