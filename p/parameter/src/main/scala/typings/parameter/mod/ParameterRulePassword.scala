package typings.parameter.mod

import typings.parameter.parameterStrings.password
import typings.parameter.parameterStrings.passwordQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<parameter.parameter.ParameterRuleString, 'type' | 'format'> */
@js.native
trait ParameterRulePassword extends _ParameterRuleItem {
  
  var default: js.UndefOr[js.Any] = js.native
  
  var allowEmpty: js.UndefOr[Boolean] = js.native
  
  var compare: js.UndefOr[String] = js.native
  
  var convertType: js.UndefOr[ParameterConvertType] = js.native
  
  var empty: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var trim: js.UndefOr[Boolean] = js.native
  
  var `type`: password | passwordQuestionmark = js.native
  
  var widelyUndefined: js.UndefOr[Boolean] = js.native
}
object ParameterRulePassword {
  
  @scala.inline
  def apply(`type`: password | passwordQuestionmark): ParameterRulePassword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRulePassword]
  }
  
  @scala.inline
  implicit class ParameterRulePasswordMutableBuilder[Self <: ParameterRulePassword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    @scala.inline
    def setCompare(value: String): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
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
    def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    @scala.inline
    def setType(value: password | passwordQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidelyUndefined(value: Boolean): Self = StObject.set(x, "widelyUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidelyUndefinedUndefined: Self = StObject.set(x, "widelyUndefined", js.undefined)
  }
}
