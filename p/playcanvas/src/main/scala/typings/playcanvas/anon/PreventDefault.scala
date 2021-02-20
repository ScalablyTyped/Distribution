package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreventDefault extends StObject {
  
  var preventDefault: js.UndefOr[Boolean] = js.native
  
  var stopPropagation: js.UndefOr[Boolean] = js.native
}
object PreventDefault {
  
  @scala.inline
  def apply(): PreventDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreventDefault]
  }
  
  @scala.inline
  implicit class PreventDefaultMutableBuilder[Self <: PreventDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
  }
}
