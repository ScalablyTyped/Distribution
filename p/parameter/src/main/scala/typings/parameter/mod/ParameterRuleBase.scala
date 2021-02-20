package typings.parameter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRuleBase extends StObject {
  
  /**
    * The default value of property, once the property is allowed non-required and missed, parameter will
    * use this as the default value. **This may change the original input params.**
    */
  var default: js.UndefOr[js.Any] = js.native
  
  /**
    * Make parameter convert the input param to the specific type, support int, number, string and boolean,
    * also support a function to customize your own convert method.
    */
  var convertType: js.UndefOr[ParameterConvertType] = js.native
  
  /**
    * If required is set to false, this property can be null or undefined.
    * @default true
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of property, every type has it's own rule for the validate.
    */
  var `type`: String = js.native
  
  /**
    * convert empty string(''), NaN, Null to undefined, this option can make rule.required more powerful,
    * **This may change the original input params.**
    * @default false
    */
  var widelyUndefined: js.UndefOr[Boolean] = js.native
}
object ParameterRuleBase {
  
  @scala.inline
  def apply(`type`: String): ParameterRuleBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleBase]
  }
  
  @scala.inline
  implicit class ParameterRuleBaseMutableBuilder[Self <: ParameterRuleBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvertType(value: ParameterConvertType): Self = StObject.set(x, "convertType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertTypeFunction1(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "convertType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertTypeUndefined: Self = StObject.set(x, "convertType", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidelyUndefined(value: Boolean): Self = StObject.set(x, "widelyUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidelyUndefinedUndefined: Self = StObject.set(x, "widelyUndefined", js.undefined)
  }
}
