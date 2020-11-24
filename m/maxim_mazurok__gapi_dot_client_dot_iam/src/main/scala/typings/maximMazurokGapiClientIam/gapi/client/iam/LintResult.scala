package typings.maximMazurokGapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LintResult extends js.Object {
  
  /** Human readable debug message associated with the issue. */
  var debugMessage: js.UndefOr[String] = js.native
  
  /**
    * The name of the field for which this lint result is about. For nested messages `field_name` consists of names of the embedded fields separated by period character. The top-level
    * qualifier is the input object to lint in the request. For example, the `field_name` value `condition.expression` identifies a lint result for the `expression` field of the provided
    * condition.
    */
  var fieldName: js.UndefOr[String] = js.native
  
  /** The validation unit level. */
  var level: js.UndefOr[String] = js.native
  
  /** 0-based character position of problematic construct within the object identified by `field_name`. Currently, this is populated only for condition expression. */
  var locationOffset: js.UndefOr[Double] = js.native
  
  /** The validation unit severity. */
  var severity: js.UndefOr[String] = js.native
  
  /** The validation unit name, for instance "lintValidationUnits/ConditionComplexityCheck". */
  var validationUnitName: js.UndefOr[String] = js.native
}
object LintResult {
  
  @scala.inline
  def apply(): LintResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintResult]
  }
  
  @scala.inline
  implicit class LintResultOps[Self <: LintResult] (val x: Self) extends AnyVal {
    
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
    def setDebugMessage(value: String): Self = this.set("debugMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugMessage: Self = this.set("debugMessage", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLocationOffset(value: Double): Self = this.set("locationOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationOffset: Self = this.set("locationOffset", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setValidationUnitName(value: String): Self = this.set("validationUnitName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationUnitName: Self = this.set("validationUnitName", js.undefined)
  }
}
