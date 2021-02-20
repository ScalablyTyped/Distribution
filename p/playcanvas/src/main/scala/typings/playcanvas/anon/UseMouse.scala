package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseMouse extends StObject {
  
  var useMouse: js.UndefOr[Boolean] = js.native
  
  var useTouch: js.UndefOr[Boolean] = js.native
  
  var useXr: js.UndefOr[Boolean] = js.native
}
object UseMouse {
  
  @scala.inline
  def apply(): UseMouse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMouse]
  }
  
  @scala.inline
  implicit class UseMouseMutableBuilder[Self <: UseMouse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseMouse(value: Boolean): Self = StObject.set(x, "useMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMouseUndefined: Self = StObject.set(x, "useMouse", js.undefined)
    
    @scala.inline
    def setUseTouch(value: Boolean): Self = StObject.set(x, "useTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTouchUndefined: Self = StObject.set(x, "useTouch", js.undefined)
    
    @scala.inline
    def setUseXr(value: Boolean): Self = StObject.set(x, "useXr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseXrUndefined: Self = StObject.set(x, "useXr", js.undefined)
  }
}
