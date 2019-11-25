package typings.opentracing.libBinaryUnderscoreCarrierMod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryCarrier extends js.Object {
  var buffer: ArrayLike[Double]
}

object BinaryCarrier {
  @scala.inline
  def apply(buffer: ArrayLike[Double]): BinaryCarrier = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BinaryCarrier]
  }
}

