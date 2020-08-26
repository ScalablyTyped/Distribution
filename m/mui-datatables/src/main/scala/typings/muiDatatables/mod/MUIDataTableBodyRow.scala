package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableBodyRow extends js.Object {
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[js.Object] = js.native
  var onClick: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var options: js.Object = js.native
  var rowSelected: js.UndefOr[Boolean] = js.native
}

object MUIDataTableBodyRow {
  @scala.inline
  def apply(options: js.Object): MUIDataTableBodyRow = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableBodyRow]
  }
  @scala.inline
  implicit class MUIDataTableBodyRowOps[Self <: MUIDataTableBodyRow] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setOnClick(value: /* args */ js.Any => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setRowSelected(value: Boolean): Self = this.set("rowSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSelected: Self = this.set("rowSelected", js.undefined)
  }
  
}

