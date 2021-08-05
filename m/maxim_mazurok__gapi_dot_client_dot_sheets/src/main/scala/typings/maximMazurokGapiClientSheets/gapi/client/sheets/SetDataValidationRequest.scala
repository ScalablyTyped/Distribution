package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDataValidationRequest extends StObject {
  
  /** The range the data validation rule should apply to. */
  var range: js.UndefOr[GridRange] = js.undefined
  
  /** The data validation rule to set on each cell in the range, or empty to clear the data validation in the range. */
  var rule: js.UndefOr[DataValidationRule] = js.undefined
}
object SetDataValidationRequest {
  
  inline def apply(): SetDataValidationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetDataValidationRequest]
  }
  
  extension [Self <: SetDataValidationRequest](x: Self) {
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRule(value: DataValidationRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
