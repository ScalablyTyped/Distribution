package typings.momentDashTimezone.momentDashTimezoneMomentDashTimezoneMod.momentMod

import typings.moment.momentMod.MomentFormatSpecification
import typings.momentDashTimezone.Anon_Links
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentTimezone extends js.Object {
  def apply(): typings.moment.momentMod.Moment = js.native
  def apply(
    date: String,
    format: MomentFormatSpecification,
    language: String,
    strict: Boolean,
    timezone: String
  ): typings.moment.momentMod.Moment = js.native
  def apply(date: String, format: MomentFormatSpecification, language: String, timezone: String): typings.moment.momentMod.Moment = js.native
  def apply(date: String, format: MomentFormatSpecification, strict: Boolean, timezone: String): typings.moment.momentMod.Moment = js.native
  def apply(date: String, format: MomentFormatSpecification, timezone: String): typings.moment.momentMod.Moment = js.native
  def apply(date: String, timezone: String): typings.moment.momentMod.Moment = js.native
  def apply(date: js.Any, timezone: String): typings.moment.momentMod.Moment = js.native
  def apply(date: js.Array[Double], timezone: String): typings.moment.momentMod.Moment = js.native
  def apply(date: Double, timezone: String): typings.moment.momentMod.Moment = js.native
  def apply(date: typings.moment.momentMod.Moment, timezone: String): typings.moment.momentMod.Moment = js.native
  def apply(date: Date, timezone: String): typings.moment.momentMod.Moment = js.native
  def apply(timezone: String): typings.moment.momentMod.Moment = js.native
  def add(packedZoneString: String): Unit = js.native
  def add(packedZoneString: js.Array[String]): Unit = js.native
  def guess(): String = js.native
  def guess(ignoreCache: Boolean): String = js.native
  def link(packedLinkString: String): Unit = js.native
  def link(packedLinkString: js.Array[String]): Unit = js.native
  def load(data: Anon_Links): Unit = js.native
  def names(): js.Array[String] = js.native
  def setDefault(): MomentTimezone = js.native
  def setDefault(timezone: String): MomentTimezone = js.native
  def zone(timezone: String): MomentZone | Null = js.native
}

