package typings.parameter.mod

import typings.parameter.parameterStrings.password
import typings.parameter.parameterStrings.passwordQuestionmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<parameter.parameter.ParameterRuleString, 'type' | 'format'> */
@js.native
trait ParameterRulePassword extends _ParameterRuleItem {
  
  var allowEmpty: js.UndefOr[Boolean] = js.native
  
  var compare: js.UndefOr[String] = js.native
  
  var convertType: js.UndefOr[ParameterConvertType] = js.native
  
  var default: js.UndefOr[js.Any] = js.native
  
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
  implicit class ParameterRulePasswordOps[Self <: ParameterRulePassword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: password | passwordQuestionmark): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    
    @scala.inline
    def setCompare(value: String): Self = this.set("compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompare: Self = this.set("compare", js.undefined)
    
    @scala.inline
    def setConvertTypeFunction1(value: /* value */ js.Any => js.Any): Self = this.set("convertType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertType(value: ParameterConvertType): Self = this.set("convertType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertType: Self = this.set("convertType", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setWidelyUndefined(value: Boolean): Self = this.set("widelyUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidelyUndefined: Self = this.set("widelyUndefined", js.undefined)
  }
}
