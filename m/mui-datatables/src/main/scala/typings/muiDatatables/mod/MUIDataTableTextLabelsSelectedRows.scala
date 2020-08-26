package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableTextLabelsSelectedRows extends js.Object {
  var delete: String = js.native
  var deleteAria: String = js.native
  var text: String = js.native
}

object MUIDataTableTextLabelsSelectedRows {
  @scala.inline
  def apply(delete: String, deleteAria: String, text: String): MUIDataTableTextLabelsSelectedRows = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], deleteAria = deleteAria.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsSelectedRows]
  }
  @scala.inline
  implicit class MUIDataTableTextLabelsSelectedRowsOps[Self <: MUIDataTableTextLabelsSelectedRows] (val x: Self) extends AnyVal {
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
    def setDeleteAria(value: String): Self = this.set("deleteAria", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

