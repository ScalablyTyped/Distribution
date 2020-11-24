package typings.meyda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Imag extends js.Object {
  
  var imag: js.Array[Double] = js.native
  
  var real: js.Array[Double] = js.native
}
object Imag {
  
  @scala.inline
  def apply(imag: js.Array[Double], real: js.Array[Double]): Imag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imag]
  }
  
  @scala.inline
  implicit class ImagOps[Self <: Imag] (val x: Self) extends AnyVal {
    
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
    def setImagVarargs(value: Double*): Self = this.set("imag", js.Array(value :_*))
    
    @scala.inline
    def setImag(value: js.Array[Double]): Self = this.set("imag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealVarargs(value: Double*): Self = this.set("real", js.Array(value :_*))
    
    @scala.inline
    def setReal(value: js.Array[Double]): Self = this.set("real", value.asInstanceOf[js.Any])
  }
}
