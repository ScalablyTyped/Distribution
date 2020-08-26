package typings.minimalBitArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitArrayJSON extends js.Object {
  var bits: js.Array[Double] = js.native
  var length: Double = js.native
}

object BitArrayJSON {
  @scala.inline
  def apply(bits: js.Array[Double], length: Double): BitArrayJSON = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitArrayJSON]
  }
  @scala.inline
  implicit class BitArrayJSONOps[Self <: BitArrayJSON] (val x: Self) extends AnyVal {
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
    def setBitsVarargs(value: Double*): Self = this.set("bits", js.Array(value :_*))
    @scala.inline
    def setBits(value: js.Array[Double]): Self = this.set("bits", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

