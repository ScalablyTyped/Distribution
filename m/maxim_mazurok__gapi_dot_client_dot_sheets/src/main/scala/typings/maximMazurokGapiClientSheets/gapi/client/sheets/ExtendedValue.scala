package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedValue extends StObject {
  
  /** Represents a boolean value. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /** Represents an error. This field is read-only. */
  var errorValue: js.UndefOr[ErrorValue] = js.undefined
  
  /** Represents a formula. */
  var formulaValue: js.UndefOr[String] = js.undefined
  
  /** Represents a double value. Note: Dates, Times and DateTimes are represented as doubles in "serial number" format. */
  var numberValue: js.UndefOr[Double] = js.undefined
  
  /** Represents a string value. Leading single quotes are not included. For example, if the user typed `'123` into the UI, this would be represented as a `stringValue` of `"123"`. */
  var stringValue: js.UndefOr[String] = js.undefined
}
object ExtendedValue {
  
  inline def apply(): ExtendedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedValue]
  }
  
  extension [Self <: ExtendedValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setErrorValue(value: ErrorValue): Self = StObject.set(x, "errorValue", value.asInstanceOf[js.Any])
    
    inline def setErrorValueUndefined: Self = StObject.set(x, "errorValue", js.undefined)
    
    inline def setFormulaValue(value: String): Self = StObject.set(x, "formulaValue", value.asInstanceOf[js.Any])
    
    inline def setFormulaValueUndefined: Self = StObject.set(x, "formulaValue", js.undefined)
    
    inline def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
