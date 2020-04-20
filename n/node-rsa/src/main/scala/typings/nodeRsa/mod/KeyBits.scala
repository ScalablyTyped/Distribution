package typings.nodeRsa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBits extends js.Object {
  /**
    * The length of the key in bits.
    */
  var b: Double
}

object KeyBits {
  @scala.inline
  def apply(b: Double): KeyBits = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyBits]
  }
}

