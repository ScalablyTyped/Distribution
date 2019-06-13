package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookFilterDatetime extends js.Object {
  var date: js.UndefOr[java.lang.String] = js.undefined
  var specificity: js.UndefOr[java.lang.String] = js.undefined
}

object WorkbookFilterDatetime {
  @scala.inline
  def apply(date: java.lang.String = null, specificity: java.lang.String = null): WorkbookFilterDatetime = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (specificity != null) __obj.updateDynamic("specificity")(specificity)
    __obj.asInstanceOf[WorkbookFilterDatetime]
  }
}

