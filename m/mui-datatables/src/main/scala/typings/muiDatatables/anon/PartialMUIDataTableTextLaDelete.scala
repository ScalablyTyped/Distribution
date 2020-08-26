package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsSelectedRows> */
@js.native
trait PartialMUIDataTableTextLaDelete extends js.Object {
  var delete: js.UndefOr[String] = js.native
  var deleteAria: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object PartialMUIDataTableTextLaDelete {
  @scala.inline
  def apply(): PartialMUIDataTableTextLaDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaDelete]
  }
  @scala.inline
  implicit class PartialMUIDataTableTextLaDeleteOps[Self <: PartialMUIDataTableTextLaDelete] (val x: Self) extends AnyVal {
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
    def setDelete(value: String): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setDeleteAria(value: String): Self = this.set("deleteAria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteAria: Self = this.set("deleteAria", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

