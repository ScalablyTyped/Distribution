package typings.muiDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsFilter> */
trait PartialMUIDataTableTextLaAll extends js.Object {
  var all: js.UndefOr[String] = js.undefined
  var reset: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PartialMUIDataTableTextLaAll {
  @scala.inline
  def apply(all: String = null, reset: String = null, title: String = null): PartialMUIDataTableTextLaAll = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMUIDataTableTextLaAll]
  }
}

