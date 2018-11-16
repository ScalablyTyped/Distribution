package typings
package momentDashTimezoneLib.momentDashTimezoneMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def tz(): js.UndefOr[java.lang.String] = js.native
  def tz(timezone: java.lang.String): momentLib.momentMod.momentNs.Moment = js.native
  def tz(timezone: java.lang.String, keepLocalTime: scala.Boolean): momentLib.momentMod.momentNs.Moment = js.native
  def zoneAbbr(): java.lang.String = js.native
  def zoneName(): java.lang.String = js.native
}

