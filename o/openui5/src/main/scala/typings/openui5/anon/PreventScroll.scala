package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventScroll extends StObject {
  
  /**
    * @since 1.60 if it's set to true, the focused element won't be shifted into the viewport if it's not completely
    * visible before the focus is set
    */
  var preventScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Further control-specific setting of the focus target within the control @since 1.98
    */
  var targetInfo: js.UndefOr[Any] = js.undefined
}
object PreventScroll {
  
  inline def apply(): PreventScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreventScroll]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreventScroll] (val x: Self) extends AnyVal {
    
    inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
    
    inline def setTargetInfo(value: Any): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
    
    inline def setTargetInfoUndefined: Self = StObject.set(x, "targetInfo", js.undefined)
  }
}
