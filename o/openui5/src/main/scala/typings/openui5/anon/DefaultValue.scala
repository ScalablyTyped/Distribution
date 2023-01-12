package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  /**
    * Default value for the type (inherited if not given)
    */
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Additional validity check function for values of the type (inherited if not given)
    */
  var isValid: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Parse function that converts a locale independent string into a value of the type (inherited if not given)
    */
  var parseValue: js.UndefOr[js.Function] = js.undefined
}
object DefaultValue {
  
  inline def apply(): DefaultValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setIsValid(value: js.Function): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setParseValue(value: js.Function): Self = StObject.set(x, "parseValue", value.asInstanceOf[js.Any])
    
    inline def setParseValueUndefined: Self = StObject.set(x, "parseValue", js.undefined)
  }
}
