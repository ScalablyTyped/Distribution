package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtrlKey extends StObject {
  
  /**
    * Returns whether the "ALT" key was pressed when the event was triggered.
    */
  var altKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns whether the "CTRL" key was pressed when the event was triggered.
    */
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns whether the "META" key was pressed when the event was triggered.
    */
  var metaKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns whether the "SHIFT" key was pressed when the event was triggered.
    */
  var shiftKey: js.UndefOr[Boolean] = js.undefined
}
object CtrlKey {
  
  inline def apply(): CtrlKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CtrlKey]
  }
  
  extension [Self <: CtrlKey](x: Self) {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
  }
}
