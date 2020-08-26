package typings.minimalBitArray.mod

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitArray extends js.Object {
  var bits: Uint32Array = js.native
  var length: Double = js.native
  def get(index: Double): Boolean = js.native
  def set(index: Double, value: js.Any): Boolean = js.native
  def toJSON(): BitArrayJSON = js.native
}

object BitArray {
  @scala.inline
  def apply(
    bits: Uint32Array,
    get: Double => Boolean,
    length: Double,
    set: (Double, js.Any) => Boolean,
    toJSON: () => BitArrayJSON
  ): BitArray = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), length = length.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[BitArray]
  }
  @scala.inline
  implicit class BitArrayOps[Self <: BitArray] (val x: Self) extends AnyVal {
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
    def setBits(value: Uint32Array): Self = this.set("bits", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Double => Boolean): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: (Double, js.Any) => Boolean): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setToJSON(value: () => BitArrayJSON): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

