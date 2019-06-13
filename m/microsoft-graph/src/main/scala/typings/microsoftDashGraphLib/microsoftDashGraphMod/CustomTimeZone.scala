package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTimeZone extends TimeZoneBase {
  /**
    * The time offset of the time zone from Coordinated Universal Time (UTC). This value is in minutes.
    * Time zones that are ahead of UTC have a positive offset; time zones that are behind UTC have a negative offset.
    */
  var bias: js.UndefOr[scala.Double] = js.undefined
  /** Specifies when the time zone switches from standard time to daylight saving time. */
  var daylightOffset: js.UndefOr[DaylightTimeZoneOffset] = js.undefined
  /** Specifies when the time zone switches from daylight saving time to standard time. */
  var standardOffset: js.UndefOr[StandardTimeZoneOffset] = js.undefined
}

object CustomTimeZone {
  @scala.inline
  def apply(
    bias: scala.Int | scala.Double = null,
    daylightOffset: DaylightTimeZoneOffset = null,
    name: java.lang.String = null,
    standardOffset: StandardTimeZoneOffset = null
  ): CustomTimeZone = {
    val __obj = js.Dynamic.literal()
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (daylightOffset != null) __obj.updateDynamic("daylightOffset")(daylightOffset)
    if (name != null) __obj.updateDynamic("name")(name)
    if (standardOffset != null) __obj.updateDynamic("standardOffset")(standardOffset)
    __obj.asInstanceOf[CustomTimeZone]
  }
}

