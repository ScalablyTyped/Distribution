package typings
package onionooLib.onionooMod.OnionooNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeUptime extends js.Object {
  /**
    * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: java.lang.String
  /**
    * Object containing uptime history objects for different time periods. The specification of uptime history
    * objects is similar to those in the `uptime` field of `RelayUptime`.
    */
  var uptime: js.UndefOr[
    stdLib.Partial[
      stdLib.Record[
        onionooLib.onionooLibStrings.`1_week` | onionooLib.onionooLibStrings.`1_month` | onionooLib.onionooLibStrings.`6_months` | onionooLib.onionooLibStrings.`1_year` | onionooLib.onionooLibStrings.`5_years`, 
        Histogram
      ]
    ]
  ] = js.undefined
}

