package typings
package onionooLib.onionooMod.OnionooNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeSummary extends js.Object {
  /**
    * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var h: java.lang.String
  /**
    * Bridge nickname consisting of 1–19 alphanumerical characters.
    */
  var n: java.lang.String
  /**
    * Boolean field saying whether this bridge was listed as running in the last bridge network status.
    */
  var r: scala.Boolean
}

object BridgeSummary {
  @scala.inline
  def apply(h: java.lang.String, n: java.lang.String, r: scala.Boolean): BridgeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("n")(n)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[BridgeSummary]
  }
}

