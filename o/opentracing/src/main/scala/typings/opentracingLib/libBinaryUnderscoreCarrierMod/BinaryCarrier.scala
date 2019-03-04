package typings
package opentracingLib.libBinaryUnderscoreCarrierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryCarrier extends js.Object {
  var buffer: stdLib.ArrayLike[scala.Double]
}

object BinaryCarrier {
  @scala.inline
  def apply(buffer: stdLib.ArrayLike[scala.Double]): BinaryCarrier = {
    val __obj = js.Dynamic.literal(buffer = buffer)
  
    __obj.asInstanceOf[BinaryCarrier]
  }
}

