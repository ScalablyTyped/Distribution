package typings.onionoo.mod.Onionoo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeSummary extends js.Object {
  /**
    * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var h: String
  /**
    * Bridge nickname consisting of 1–19 alphanumerical characters.
    */
  var n: String
  /**
    * Boolean field saying whether this bridge was listed as running in the last bridge network status.
    */
  var r: Boolean
}

object BridgeSummary {
  @scala.inline
  def apply(h: String, n: String, r: Boolean): BridgeSummary = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeSummary]
  }
}

