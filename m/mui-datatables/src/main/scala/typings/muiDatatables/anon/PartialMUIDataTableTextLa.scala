package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsBody> */
trait PartialMUIDataTableTextLa extends js.Object {
  var noMatch: js.UndefOr[String] = js.undefined
  var toolTip: js.UndefOr[String] = js.undefined
}

object PartialMUIDataTableTextLa {
  @scala.inline
  def apply(noMatch: String = null, toolTip: String = null): PartialMUIDataTableTextLa = {
    val __obj = js.Dynamic.literal()
    if (noMatch != null) __obj.updateDynamic("noMatch")(noMatch.asInstanceOf[js.Any])
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMUIDataTableTextLa]
  }
}

