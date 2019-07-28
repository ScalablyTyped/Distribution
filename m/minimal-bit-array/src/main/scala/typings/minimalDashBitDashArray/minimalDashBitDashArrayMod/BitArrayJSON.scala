package typings.minimalDashBitDashArray.minimalDashBitDashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitArrayJSON extends js.Object {
  var bits: js.Array[Double]
  var length: Double
}

object BitArrayJSON {
  @scala.inline
  def apply(bits: js.Array[Double], length: Double): BitArrayJSON = {
    val __obj = js.Dynamic.literal(bits = bits, length = length)
  
    __obj.asInstanceOf[BitArrayJSON]
  }
}

