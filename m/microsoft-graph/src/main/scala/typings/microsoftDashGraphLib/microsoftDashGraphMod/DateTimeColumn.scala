package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeColumn extends js.Object {
  /**
    * How the value should be presented in the UX. Must be one of default, friendly, or standard. See below for more details.
    * If unspecified, treated as default.
    */
  var displayAs: js.UndefOr[java.lang.String] = js.undefined
  // Indicates whether the value should be presented as a date only or a date and time. Must be one of dateOnly or dateTime
  var format: js.UndefOr[java.lang.String] = js.undefined
}

object DateTimeColumn {
  @scala.inline
  def apply(displayAs: java.lang.String = null, format: java.lang.String = null): DateTimeColumn = {
    val __obj = js.Dynamic.literal()
    if (displayAs != null) __obj.updateDynamic("displayAs")(displayAs)
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[DateTimeColumn]
  }
}

