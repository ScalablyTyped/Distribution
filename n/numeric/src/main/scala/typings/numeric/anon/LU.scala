package typings.numeric.anon

import typings.numeric.mod.Matrix
import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LU extends js.Object {
  
  var LU: Matrix = js.native
  
  var P: Vector = js.native
}
object LU {
  
  @scala.inline
  def apply(LU: Matrix, P: Vector): LU = {
    val __obj = js.Dynamic.literal(LU = LU.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any])
    __obj.asInstanceOf[LU]
  }
  
  @scala.inline
  implicit class LUOps[Self <: LU] (val x: Self) extends AnyVal {
    
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
    def setLUVarargs(value: js.Array[Double]*): Self = this.set("LU", js.Array(value :_*))
    
    @scala.inline
    def setLU(value: Matrix): Self = this.set("LU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: Double*): Self = this.set("P", js.Array(value :_*))
    
    @scala.inline
    def setP(value: Vector): Self = this.set("P", value.asInstanceOf[js.Any])
  }
}
