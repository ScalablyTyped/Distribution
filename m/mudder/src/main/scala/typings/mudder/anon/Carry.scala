package typings.mudder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Carry extends js.Object {
  
  var carry: Boolean = js.native
  
  var den: Double = js.native
  
  var rem: Double = js.native
  
  var res: js.Array[Double] = js.native
}
object Carry {
  
  @scala.inline
  def apply(carry: Boolean, den: Double, rem: Double, res: js.Array[Double]): Carry = {
    val __obj = js.Dynamic.literal(carry = carry.asInstanceOf[js.Any], den = den.asInstanceOf[js.Any], rem = rem.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Carry]
  }
  
  @scala.inline
  implicit class CarryOps[Self <: Carry] (val x: Self) extends AnyVal {
    
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
    def setCarry(value: Boolean): Self = this.set("carry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDen(value: Double): Self = this.set("den", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRem(value: Double): Self = this.set("rem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResVarargs(value: Double*): Self = this.set("res", js.Array(value :_*))
    
    @scala.inline
    def setRes(value: js.Array[Double]): Self = this.set("res", value.asInstanceOf[js.Any])
  }
}
