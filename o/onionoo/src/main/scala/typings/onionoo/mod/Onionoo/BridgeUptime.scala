package typings.onionoo.mod.Onionoo

import typings.onionoo.PartialRecord1week1month6
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
  var uptime: js.UndefOr[PartialRecord1week1month6] = js.undefined
}

object BridgeUptime {
  @scala.inline
  def apply(fingerprint: String, uptime: PartialRecord1week1month6 = null): BridgeUptime = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
    if (uptime != null) __obj.updateDynamic("uptime")(uptime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeUptime]
  }
}

