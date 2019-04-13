package typings
package minimalDashBitDashArrayLib.minimalDashBitDashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitArray extends js.Object {
  var bits: stdLib.Uint32Array
  var length: scala.Double
  def get(index: scala.Double): scala.Boolean
  def set(index: scala.Double, value: js.Any): scala.Boolean
  def toJSON(): BitArrayJSON
}

object BitArray {
  @scala.inline
  def apply(
    bits: stdLib.Uint32Array,
    get: scala.Double => scala.Boolean,
    length: scala.Double,
    set: (scala.Double, js.Any) => scala.Boolean,
    toJSON: () => BitArrayJSON
  ): BitArray = {
    val __obj = js.Dynamic.literal(bits = bits, get = js.Any.fromFunction1(get), length = length, set = js.Any.fromFunction2(set), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[BitArray]
  }
}

