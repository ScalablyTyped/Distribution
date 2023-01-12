package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EscPressedPreviousValue extends StObject {
  
  /**
    * Indicates that ESC key triggered the event. **Note:** This parameter will not be sent unless the ESC
    * key is pressed.
    */
  var escPressed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the input before pressing ESC key. **Note:** This parameter will not be sent unless the
    * ESC key is pressed.
    */
  var previousValue: js.UndefOr[String] = js.undefined
  
  /**
    * The current value of the input, after a live change event.
    */
  var value: js.UndefOr[String] = js.undefined
}
object EscPressedPreviousValue {
  
  inline def apply(): EscPressedPreviousValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EscPressedPreviousValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EscPressedPreviousValue] (val x: Self) extends AnyVal {
    
    inline def setEscPressed(value: Boolean): Self = StObject.set(x, "escPressed", value.asInstanceOf[js.Any])
    
    inline def setEscPressedUndefined: Self = StObject.set(x, "escPressed", js.undefined)
    
    inline def setPreviousValue(value: String): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
