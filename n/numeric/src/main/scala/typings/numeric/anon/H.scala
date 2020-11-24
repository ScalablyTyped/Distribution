package typings.numeric.anon

import typings.numeric.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait H extends js.Object {
  
  var H: Matrix = js.native
  
  var Q: Matrix = js.native
}
object H {
  
  @scala.inline
  def apply(H: Matrix, Q: Matrix): H = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], Q = Q.asInstanceOf[js.Any])
    __obj.asInstanceOf[H]
  }
  
  @scala.inline
  implicit class HOps[Self <: H] (val x: Self) extends AnyVal {
    
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
    def setHVarargs(value: js.Array[Double]*): Self = this.set("H", js.Array(value :_*))
    
    @scala.inline
    def setH(value: Matrix): Self = this.set("H", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQVarargs(value: js.Array[Double]*): Self = this.set("Q", js.Array(value :_*))
    
    @scala.inline
    def setQ(value: Matrix): Self = this.set("Q", value.asInstanceOf[js.Any])
  }
}
