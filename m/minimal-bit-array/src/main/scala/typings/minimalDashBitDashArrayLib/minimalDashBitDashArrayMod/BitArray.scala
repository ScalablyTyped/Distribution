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
  def toJSON(): minimalDashBitDashArrayLib.minimalDashBitDashArrayMod.BitArrayNs.BitArrayJSON
}

object BitArray {
  @scala.inline
  def apply(
    bits: stdLib.Uint32Array,
    get: js.Function1[scala.Double, scala.Boolean],
    length: scala.Double,
    set: js.Function2[scala.Double, js.Any, scala.Boolean],
    toJSON: js.Function0[minimalDashBitDashArrayLib.minimalDashBitDashArrayMod.BitArrayNs.BitArrayJSON]
  ): BitArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bits")(bits)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[BitArray]
  }
}

