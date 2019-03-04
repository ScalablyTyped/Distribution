package typings
package minimalDashBitDashArrayLib.minimalDashBitDashArrayMod.BitArrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitArrayJSON extends js.Object {
  var bits: js.Array[scala.Double]
  var length: scala.Double
}

object BitArrayJSON {
  @scala.inline
  def apply(bits: js.Array[scala.Double], length: scala.Double): BitArrayJSON = {
    val __obj = js.Dynamic.literal(bits = bits, length = length)
  
    __obj.asInstanceOf[BitArrayJSON]
  }
}

