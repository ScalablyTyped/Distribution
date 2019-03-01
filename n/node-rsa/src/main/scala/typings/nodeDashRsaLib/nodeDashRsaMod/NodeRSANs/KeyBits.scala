package typings
package nodeDashRsaLib.nodeDashRsaMod.NodeRSANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBits extends js.Object {
  /**
    * The length of the key in bits.
    */
  var b: scala.Double
}

object KeyBits {
  @scala.inline
  def apply(b: scala.Double): KeyBits = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.asInstanceOf[KeyBits]
  }
}

