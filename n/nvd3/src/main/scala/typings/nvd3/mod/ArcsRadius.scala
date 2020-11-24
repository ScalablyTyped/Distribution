package typings.nvd3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcsRadius extends js.Object {
  
  var inner: Double = js.native
  
  var outer: Double = js.native
}
object ArcsRadius {
  
  @scala.inline
  def apply(inner: Double, outer: Double): ArcsRadius = {
    val __obj = js.Dynamic.literal(inner = inner.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcsRadius]
  }
  
  @scala.inline
  implicit class ArcsRadiusOps[Self <: ArcsRadius] (val x: Self) extends AnyVal {
    
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
    def setInner(value: Double): Self = this.set("inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuter(value: Double): Self = this.set("outer", value.asInstanceOf[js.Any])
  }
}
