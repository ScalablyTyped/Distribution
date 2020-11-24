package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableFormatValue extends js.Object {
  
  /** The option to convert a string-type variable value to either lowercase or uppercase. */
  var caseConversionType: js.UndefOr[String] = js.native
  
  /** The value to convert if a variable value is false. */
  var convertFalseToValue: js.UndefOr[Parameter] = js.native
  
  /** The value to convert if a variable value is null. */
  var convertNullToValue: js.UndefOr[Parameter] = js.native
  
  /** The value to convert if a variable value is true. */
  var convertTrueToValue: js.UndefOr[Parameter] = js.native
  
  /** The value to convert if a variable value is undefined. */
  var convertUndefinedToValue: js.UndefOr[Parameter] = js.native
}
object VariableFormatValue {
  
  @scala.inline
  def apply(): VariableFormatValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariableFormatValue]
  }
  
  @scala.inline
  implicit class VariableFormatValueOps[Self <: VariableFormatValue] (val x: Self) extends AnyVal {
    
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
    def setCaseConversionType(value: String): Self = this.set("caseConversionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseConversionType: Self = this.set("caseConversionType", js.undefined)
    
    @scala.inline
    def setConvertFalseToValue(value: Parameter): Self = this.set("convertFalseToValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertFalseToValue: Self = this.set("convertFalseToValue", js.undefined)
    
    @scala.inline
    def setConvertNullToValue(value: Parameter): Self = this.set("convertNullToValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertNullToValue: Self = this.set("convertNullToValue", js.undefined)
    
    @scala.inline
    def setConvertTrueToValue(value: Parameter): Self = this.set("convertTrueToValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertTrueToValue: Self = this.set("convertTrueToValue", js.undefined)
    
    @scala.inline
    def setConvertUndefinedToValue(value: Parameter): Self = this.set("convertUndefinedToValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertUndefinedToValue: Self = this.set("convertUndefinedToValue", js.undefined)
  }
}
