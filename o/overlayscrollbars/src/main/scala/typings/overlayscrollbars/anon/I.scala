package typings.overlayscrollbars.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I extends js.Object {
  
  var i: Boolean = js.native
  
  var n: Boolean = js.native
}
object I {
  
  @scala.inline
  def apply(i: Boolean, n: Boolean): I = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[I]
  }
  
  @scala.inline
  implicit class IOps[Self <: I] (val x: Self) extends AnyVal {
    
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
    def setI(value: Boolean): Self = this.set("i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Boolean): Self = this.set("n", value.asInstanceOf[js.Any])
  }
}
