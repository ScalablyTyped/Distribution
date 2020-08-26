package typings.nodeRsa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyBits extends js.Object {
  /**
    * The length of the key in bits.
    */
  var b: Double = js.native
}

object KeyBits {
  @scala.inline
  def apply(b: Double): KeyBits = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyBits]
  }
  @scala.inline
  implicit class KeyBitsOps[Self <: KeyBits] (val x: Self) extends AnyVal {
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
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
  }
  
}

