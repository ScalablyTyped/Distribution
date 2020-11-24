package typings.numeric.anon

import typings.numeric.mod.Matrix
import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A extends js.Object {
  
  var A: Matrix = js.native
  
  var I: Matrix = js.native
  
  var P: Vector = js.native
}
object A {
  
  @scala.inline
  def apply(A: Matrix, I: Matrix, P: Vector): A = {
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], I = I.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
  
  @scala.inline
  implicit class AOps[Self <: A] (val x: Self) extends AnyVal {
    
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
    def setAVarargs(value: js.Array[Double]*): Self = this.set("A", js.Array(value :_*))
    
    @scala.inline
    def setA(value: Matrix): Self = this.set("A", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIVarargs(value: js.Array[Double]*): Self = this.set("I", js.Array(value :_*))
    
    @scala.inline
    def setI(value: Matrix): Self = this.set("I", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: Double*): Self = this.set("P", js.Array(value :_*))
    
    @scala.inline
    def setP(value: Vector): Self = this.set("P", value.asInstanceOf[js.Any])
  }
}
