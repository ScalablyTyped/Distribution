package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableResize extends js.Object {
  var classes: js.UndefOr[js.Object] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var rowSelected: js.UndefOr[Boolean] = js.native
  var setResizeable: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var updateDividers: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
}

object MUIDataTableResize {
  @scala.inline
  def apply(): MUIDataTableResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableResize]
  }
  @scala.inline
  implicit class MUIDataTableResizeOps[Self <: MUIDataTableResize] (val x: Self) extends AnyVal {
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
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setRowSelected(value: Boolean): Self = this.set("rowSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSelected: Self = this.set("rowSelected", js.undefined)
    @scala.inline
    def setSetResizeable(value: /* args */ js.Any => _): Self = this.set("setResizeable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetResizeable: Self = this.set("setResizeable", js.undefined)
    @scala.inline
    def setUpdateDividers(value: /* args */ js.Any => _): Self = this.set("updateDividers", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdateDividers: Self = this.set("updateDividers", js.undefined)
  }
  
}

