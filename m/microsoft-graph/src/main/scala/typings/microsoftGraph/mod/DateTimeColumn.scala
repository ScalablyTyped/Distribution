package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeColumn extends js.Object {
  /**
    * How the value should be presented in the UX. Must be one of default, friendly, or standard. See below for more details.
    * If unspecified, treated as default.
    */
  var displayAs: js.UndefOr[String] = js.undefined
  // Indicates whether the value should be presented as a date only or a date and time. Must be one of dateOnly or dateTime
  var format: js.UndefOr[String] = js.undefined
}

object DateTimeColumn {
  @scala.inline
  def apply(displayAs: String = null, format: String = null): DateTimeColumn = {
    val __obj = js.Dynamic.literal()
    if (displayAs != null) __obj.updateDynamic("displayAs")(displayAs.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeColumn]
  }
}

