package typings.muiDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsSelectedRows> */
trait PartialMUIDataTableTextLaDelete extends js.Object {
  var delete: js.UndefOr[String] = js.undefined
  var deleteAria: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object PartialMUIDataTableTextLaDelete {
  @scala.inline
  def apply(delete: String = null, deleteAria: String = null, text: String = null): PartialMUIDataTableTextLaDelete = {
    val __obj = js.Dynamic.literal()
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (deleteAria != null) __obj.updateDynamic("deleteAria")(deleteAria.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMUIDataTableTextLaDelete]
  }
}

