package typings.numeric.anon

import typings.numeric.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait B extends js.Object {
  
  var B: Matrix = js.native
  
  var Q: Matrix = js.native
}
object B {
  
  @scala.inline
  def apply(B: Matrix, Q: Matrix): B = {
    val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], Q = Q.asInstanceOf[js.Any])
    __obj.asInstanceOf[B]
  }
  
  @scala.inline
  implicit class BOps[Self <: B] (val x: Self) extends AnyVal {
    
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
    def setBVarargs(value: js.Array[Double]*): Self = this.set("B", js.Array(value :_*))
    
    @scala.inline
    def setB(value: Matrix): Self = this.set("B", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQVarargs(value: js.Array[Double]*): Self = this.set("Q", js.Array(value :_*))
    
    @scala.inline
    def setQ(value: Matrix): Self = this.set("Q", value.asInstanceOf[js.Any])
  }
}
