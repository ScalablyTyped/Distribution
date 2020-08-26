package typings.muiDatatables.anon

import typings.muiDatatables.mod.MUIDataTableColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsBody> */
@js.native
trait PartialMUIDataTableTextLa extends js.Object {
  var columnHeaderTooltip: js.UndefOr[js.Function1[/* column */ MUIDataTableColumn, String]] = js.native
  var noMatch: js.UndefOr[String] = js.native
  var toolTip: js.UndefOr[String] = js.native
}

object PartialMUIDataTableTextLa {
  @scala.inline
  def apply(): PartialMUIDataTableTextLa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLa]
  }
  @scala.inline
  implicit class PartialMUIDataTableTextLaOps[Self <: PartialMUIDataTableTextLa] (val x: Self) extends AnyVal {
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
    def setColumnHeaderTooltip(value: /* column */ MUIDataTableColumn => String): Self = this.set("columnHeaderTooltip", js.Any.fromFunction1(value))
    @scala.inline
    def deleteColumnHeaderTooltip: Self = this.set("columnHeaderTooltip", js.undefined)
    @scala.inline
    def setNoMatch(value: String): Self = this.set("noMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoMatch: Self = this.set("noMatch", js.undefined)
    @scala.inline
    def setToolTip(value: String): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolTip: Self = this.set("toolTip", js.undefined)
  }
  
}

