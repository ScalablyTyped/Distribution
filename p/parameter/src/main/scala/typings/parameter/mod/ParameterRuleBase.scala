package typings.parameter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRuleBase extends js.Object {
  
  /**
    * Make parameter convert the input param to the specific type, support int, number, string and boolean,
    * also support a function to customize your own convert method.
    */
  var convertType: js.UndefOr[ParameterConvertType] = js.native
  
  /**
    * The default value of property, once the property is allowed non-required and missed, parameter will
    * use this as the default value. **This may change the original input params.**
    */
  var default: js.UndefOr[js.Any] = js.native
  
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
  implicit class ParameterRuleBaseOps[Self <: ParameterRuleBase] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
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
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setWidelyUndefined(value: Boolean): Self = this.set("widelyUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidelyUndefined: Self = this.set("widelyUndefined", js.undefined)
  }
}
