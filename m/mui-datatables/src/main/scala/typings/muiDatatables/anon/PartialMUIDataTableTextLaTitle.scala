package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsViewColumns> */
trait PartialMUIDataTableTextLaTitle extends js.Object {
  var title: js.UndefOr[String] = js.undefined
  var titleAria: js.UndefOr[String] = js.undefined
}

object PartialMUIDataTableTextLaTitle {
  @scala.inline
  def apply(title: String = null, titleAria: String = null): PartialMUIDataTableTextLaTitle = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleAria != null) __obj.updateDynamic("titleAria")(titleAria.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMUIDataTableTextLaTitle]
  }
}

