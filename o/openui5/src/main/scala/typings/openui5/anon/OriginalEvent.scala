package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalEvent extends StObject {
  
  /**
    * The onsapenter event, received by the pop up
    */
  var originalEvent: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The control that was focused when the user pressed the Enter key (may be null)
    */
  var originalSrcControl: js.UndefOr[default] = js.undefined
}
object OriginalEvent {
  
  inline def apply(): OriginalEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginalEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginalEvent] (val x: Self) extends AnyVal {
    
    inline def setOriginalEvent(value: js.Object): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    inline def setOriginalSrcControl(value: default): Self = StObject.set(x, "originalSrcControl", value.asInstanceOf[js.Any])
    
    inline def setOriginalSrcControlUndefined: Self = StObject.set(x, "originalSrcControl", js.undefined)
  }
}
