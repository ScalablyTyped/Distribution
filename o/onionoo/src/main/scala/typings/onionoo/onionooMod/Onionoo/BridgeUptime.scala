package typings.onionoo.onionooMod.Onionoo

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

trait BridgeUptime extends js.Object {
  /**
    * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: String
  /**
    * Object containing uptime history objects for different time periods. The specification of uptime history
    * objects is similar to those in the `uptime` field of `RelayUptime`.
    */
  var uptime: js.UndefOr[
    Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]]
  ] = js.undefined
}

object BridgeUptime {
  @scala.inline
  def apply(
    fingerprint: String,
    uptime: Partial[Record[`1_week` | `1_month` | `6_months` | `1_year` | `5_years`, Histogram]] = null
  ): BridgeUptime = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint)
    if (uptime != null) __obj.updateDynamic("uptime")(uptime)
    __obj.asInstanceOf[BridgeUptime]
  }
}

