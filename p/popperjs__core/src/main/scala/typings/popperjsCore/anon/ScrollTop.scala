package typings.popperjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollTop extends js.Object {
  
  var scrollLeft: js.Any = js.native
  
  var scrollTop: js.Any = js.native
}
object ScrollTop {
  
  @scala.inline
  def apply(scrollLeft: js.Any, scrollTop: js.Any): ScrollTop = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollTop]
  }
  
  @scala.inline
  implicit class ScrollTopOps[Self <: ScrollTop] (val x: Self) extends AnyVal {
    
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
    def setScrollLeft(value: js.Any): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: js.Any): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
  }
}
