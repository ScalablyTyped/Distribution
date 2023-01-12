package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventDefault extends StObject {
  
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
}
object PreventDefault {
  
  inline def apply(): PreventDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreventDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreventDefault] (val x: Self) extends AnyVal {
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
  }
}
