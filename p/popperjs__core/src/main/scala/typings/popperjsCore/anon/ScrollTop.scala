package typings.popperjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollTop extends StObject {
  
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
  implicit class ScrollTopMutableBuilder[Self <: ScrollTop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollLeft(value: js.Any): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: js.Any): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
