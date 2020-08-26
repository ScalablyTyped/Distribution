package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableToolbarSelect extends js.Object {
  var classes: js.UndefOr[js.Object] = js.native
  var displayData: js.UndefOr[js.Any] = js.native
  var onRowsDelete: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var options: js.Object = js.native
  var rowSelected: js.UndefOr[Boolean] = js.native
  var selectRowUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
}

object MUIDataTableToolbarSelect {
  @scala.inline
  def apply(options: js.Object): MUIDataTableToolbarSelect = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableToolbarSelect]
  }
  @scala.inline
  implicit class MUIDataTableToolbarSelectOps[Self <: MUIDataTableToolbarSelect] (val x: Self) extends AnyVal {
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
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setDisplayData(value: js.Any): Self = this.set("displayData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayData: Self = this.set("displayData", js.undefined)
    @scala.inline
    def setOnRowsDelete(value: /* args */ js.Any => _): Self = this.set("onRowsDelete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowsDelete: Self = this.set("onRowsDelete", js.undefined)
    @scala.inline
    def setRowSelected(value: Boolean): Self = this.set("rowSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSelected: Self = this.set("rowSelected", js.undefined)
    @scala.inline
    def setSelectRowUpdate(value: /* args */ js.Any => _): Self = this.set("selectRowUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectRowUpdate: Self = this.set("selectRowUpdate", js.undefined)
  }
  
}

