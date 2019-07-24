package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZoneInformation extends js.Object {
  // An identifier for the time zone.
  var alias: js.UndefOr[java.lang.String] = js.undefined
  // A display string that represents the time zone.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
}

object TimeZoneInformation {
  @scala.inline
  def apply(alias: java.lang.String = null, displayName: java.lang.String = null): TimeZoneInformation = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[TimeZoneInformation]
  }
}

