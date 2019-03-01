package typings
package onionooLib.onionooMod.OnionooNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelaySummary extends js.Object {
  /**
    * Array of IPv4 or IPv6 addresses where the relay accepts onion-routing connections or which the relay
    * used to exit to the Internet in the past 24 hours. The first address is the primary onion-routing address
    * that the relay used to register in the network, subsequent addresses are in arbitrary order. IPv6 hex
    * characters are all lower-case.
    */
  var a: js.Array[java.lang.String]
  /**
    * Relay fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var f: java.lang.String
  /**
    * Relay nickname consisting of 1–19 alphanumerical characters.
    */
  var n: java.lang.String
  /**
    * Boolean field saying whether this relay was listed as running in the last relay network status consensus.
    */
  var r: scala.Boolean
}

object RelaySummary {
  @scala.inline
  def apply(a: js.Array[java.lang.String], f: java.lang.String, n: java.lang.String, r: scala.Boolean): RelaySummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("f")(f)
    __obj.updateDynamic("n")(n)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[RelaySummary]
  }
}

