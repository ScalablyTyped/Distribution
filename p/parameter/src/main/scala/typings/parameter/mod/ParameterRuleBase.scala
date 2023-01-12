package typings.parameter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRuleBase extends StObject {
  
  /**
    * The default value of property, once the property is allowed non-required and missed, parameter will
    * use this as the default value. **This may change the original input params.**
    */
  var default: js.UndefOr[Any] = js.undefined
  
  /**
    * Make parameter convert the input param to the specific type, support int, number, string and boolean,
    * also support a function to customize your own convert method.
    */
  var convertType: js.UndefOr[ParameterConvertType] = js.undefined
  
  /**
    * If required is set to false, this property can be null or undefined.
    * @default true
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of property, every type has it's own rule for the validate.
    */
  var `type`: String
  
  /**
    * convert empty string(''), NaN, Null to undefined, this option can make rule.required more powerful,
    * **This may change the original input params.**
    * @default false
    */
  var widelyUndefined: js.UndefOr[Boolean] = js.undefined
}
object ParameterRuleBase {
  
  inline def apply(`type`: String): ParameterRuleBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterRuleBase] (val x: Self) extends AnyVal {
    
    inline def setConvertType(value: ParameterConvertType): Self = StObject.set(x, "convertType", value.asInstanceOf[js.Any])
    
    inline def setConvertTypeFunction1(value: /* value */ Any => Any): Self = StObject.set(x, "convertType", js.Any.fromFunction1(value))
    
    inline def setConvertTypeUndefined: Self = StObject.set(x, "convertType", js.undefined)
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidelyUndefined(value: Boolean): Self = StObject.set(x, "widelyUndefined", value.asInstanceOf[js.Any])
    
    inline def setWidelyUndefinedUndefined: Self = StObject.set(x, "widelyUndefined", js.undefined)
  }
}
