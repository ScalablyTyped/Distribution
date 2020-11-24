package typings.numeric.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LUPP extends js.Object {
  
  var L: SparseMatrix = js.native
  
  var P: Vector = js.native
  
  var Pinv: Vector = js.native
  
  var U: SparseMatrix = js.native
}
object LUPP {
  
  @scala.inline
  def apply(L: SparseMatrix, P: Vector, Pinv: Vector, U: SparseMatrix): LUPP = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], Pinv = Pinv.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
    __obj.asInstanceOf[LUPP]
  }
  
  @scala.inline
  implicit class LUPPOps[Self <: LUPP] (val x: Self) extends AnyVal {
    
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
    def setL(value: SparseMatrix): Self = this.set("L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: Double*): Self = this.set("P", js.Array(value :_*))
    
    @scala.inline
    def setP(value: Vector): Self = this.set("P", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinvVarargs(value: Double*): Self = this.set("Pinv", js.Array(value :_*))
    
    @scala.inline
    def setPinv(value: Vector): Self = this.set("Pinv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU(value: SparseMatrix): Self = this.set("U", value.asInstanceOf[js.Any])
  }
}
