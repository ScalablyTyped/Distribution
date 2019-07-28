package typings.minimalDashBitDashArray.minimalDashBitDashArrayMod

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitArray extends js.Object {
  var bits: Uint32Array
  var length: Double
  def get(index: Double): Boolean
  def set(index: Double, value: js.Any): Boolean
  def toJSON(): BitArrayJSON
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
    val __obj = js.Dynamic.literal(bits = bits, get = js.Any.fromFunction1(get), length = length, set = js.Any.fromFunction2(set), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[BitArray]
  }
}

