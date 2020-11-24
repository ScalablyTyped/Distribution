package typings.opentracing.binaryCarrierMod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryCarrier extends js.Object {
  
  var buffer: ArrayLike[Double] = js.native
}
object BinaryCarrier {
  
  @scala.inline
  def apply(buffer: ArrayLike[Double]): BinaryCarrier = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryCarrier]
  }
  
  @scala.inline
  implicit class BinaryCarrierOps[Self <: BinaryCarrier] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: ArrayLike[Double]): Self = this.set("buffer", value.asInstanceOf[js.Any])
  }
}
