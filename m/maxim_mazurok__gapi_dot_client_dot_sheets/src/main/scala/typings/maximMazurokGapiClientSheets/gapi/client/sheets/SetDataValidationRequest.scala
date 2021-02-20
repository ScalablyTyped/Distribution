package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDataValidationRequest extends StObject {
  
  /** The range the data validation rule should apply to. */
  var range: js.UndefOr[GridRange] = js.native
  
  /** The data validation rule to set on each cell in the range, or empty to clear the data validation in the range. */
  var rule: js.UndefOr[DataValidationRule] = js.native
}
object SetDataValidationRequest {
  
  @scala.inline
  def apply(): SetDataValidationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetDataValidationRequest]
  }
  
  @scala.inline
  implicit class SetDataValidationRequestMutableBuilder[Self <: SetDataValidationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRule(value: DataValidationRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
