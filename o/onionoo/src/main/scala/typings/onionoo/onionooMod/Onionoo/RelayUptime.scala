package typings.onionoo.onionooMod.Onionoo

import org.scalablytyped.runtime.StringDictionary
import typings.onionoo.onionooStrings.`1_month`
import typings.onionoo.onionooStrings.`1_week`
import typings.onionoo.onionooStrings.`1_year`
import typings.onionoo.onionooStrings.`5_years`
import typings.onionoo.onionooStrings.`6_months`
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayUptime extends js.Object {
  /**
    * Relay fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: String
  /**
    * Object containing fractional times of this relay having relay flags assigned. Keys are flag names like
    * `Running` or `Exit`, values are objects similar to the uptime field above, again with keys like
    * `1_week` etc. If a relay never had a given relay flag assigned, no object is included for that flag.
    */
  var flags: js.UndefOr[
    StringDictionary[
      Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]]
    ]
  ] = js.undefined
  /**
    * Object containing graph history objects with the fractional uptime of this relay. Keys are string
    * representation of the time period covered by the graph history object. Keys are fixed strings
    * `1_week`, `1_month`, `6_months`, `1_year`, and `5_years`. Keys refer to the last known uptime history
    * of a relay, not to the time when the uptime document was published. A graph history object is only
    * contained if the time period it covers is not already contained in another graph history object with
    * shorter time period and higher data resolution. The unit is fractional uptime from `0` to `1`.
    * Contained graph history objects may contain null values if less than 20% of network statuses have been
    * processed for a given time period.
    */
  var uptime: js.UndefOr[
    Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]]
  ] = js.undefined
}

object RelayUptime {
  @scala.inline
  def apply(
    fingerprint: String,
    flags: StringDictionary[
      Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]]
    ] = null,
    uptime: Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]] = null
  ): RelayUptime = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (uptime != null) __obj.updateDynamic("uptime")(uptime)
    __obj.asInstanceOf[RelayUptime]
  }
}

