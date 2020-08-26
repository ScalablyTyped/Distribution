package typings.onionoo.mod.Onionoo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeSummary extends js.Object {
  /**
    * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var h: String = js.native
  /**
    * Bridge nickname consisting of 1–19 alphanumerical characters.
    */
  var n: String = js.native
  /**
    * Boolean field saying whether this bridge was listed as running in the last bridge network status.
    */
  var r: Boolean = js.native
}

object BridgeSummary {
  @scala.inline
  def apply(h: String, n: String, r: Boolean): BridgeSummary = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeSummary]
  }
  @scala.inline
  implicit class BridgeSummaryOps[Self <: BridgeSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setH(value: String): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: Boolean): Self = this.set("r", value.asInstanceOf[js.Any])
  }
  
}

