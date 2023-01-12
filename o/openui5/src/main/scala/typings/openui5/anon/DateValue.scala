package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateValue extends StObject {
  
  /**
    * The value of control as JavaScript Date Object or null if value is empty.
    */
  var dateValue: js.UndefOr[js.Object] = js.undefined
  
  /**
    * if set, the entered value is a valid date. If not set the entered value cannot be converted to a date.
    */
  var valid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The string value of the control in given valueFormat (or locale format).
    */
  var value: js.UndefOr[String] = js.undefined
}
object DateValue {
  
  inline def apply(): DateValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateValue] (val x: Self) extends AnyVal {
    
    inline def setDateValue(value: js.Object): Self = StObject.set(x, "dateValue", value.asInstanceOf[js.Any])
    
    inline def setDateValueUndefined: Self = StObject.set(x, "dateValue", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
