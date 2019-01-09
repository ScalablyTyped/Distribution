package typings
package momentDashTimezoneLib.momentDashTimezoneMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentTimezone extends js.Object {
  def apply(): momentLib.momentMod.momentNs.Moment = js.native
  def apply(
    date: java.lang.String,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean,
    timezone: java.lang.String
  ): momentLib.momentMod.momentNs.Moment = js.native
  def apply(
    date: java.lang.String,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    language: java.lang.String,
    timezone: java.lang.String
  ): momentLib.momentMod.momentNs.Moment = js.native
  def apply(
    date: java.lang.String,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    strict: scala.Boolean,
    timezone: java.lang.String
  ): momentLib.momentMod.momentNs.Moment = js.native
  def apply(
    date: java.lang.String,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    timezone: java.lang.String
  ): momentLib.momentMod.momentNs.Moment = js.native
  def apply(date: java.lang.String, timezone: java.lang.String): momentLib.momentMod.momentNs.Moment = js.native
  def apply(date: js.Any, timezone: java.lang.String): momentLib.momentMod.momentNs.Moment = js.native
  def apply(date: js.Array[scala.Double], timezone: java.lang.String): momentLib.momentMod.momentNs.Moment = js.native
  def apply(date: momentLib.momentMod.momentNs.Moment, timezone: java.lang.String): momentLib.momentMod.momentNs.Moment = js.native
  def apply(date: scala.Double, timezone: java.lang.String): momentLib.momentMod.momentNs.Moment = js.native
  def apply(date: stdLib.Date, timezone: java.lang.String): momentLib.momentMod.momentNs.Moment = js.native
  def apply(timezone: java.lang.String): momentLib.momentMod.momentNs.Moment = js.native
  def add(packedZoneString: java.lang.String): scala.Unit = js.native
  def add(packedZoneString: js.Array[java.lang.String]): scala.Unit = js.native
  def guess(): java.lang.String = js.native
  def guess(ignoreCache: scala.Boolean): java.lang.String = js.native
  def link(packedLinkString: java.lang.String): scala.Unit = js.native
  def link(packedLinkString: js.Array[java.lang.String]): scala.Unit = js.native
  def load(data: momentDashTimezoneLib.Anon_Links): scala.Unit = js.native
  def names(): js.Array[java.lang.String] = js.native
  def setDefault(): MomentTimezone = js.native
  def setDefault(timezone: java.lang.String): MomentTimezone = js.native
  def zone(timezone: java.lang.String): MomentZone | scala.Null = js.native
}

