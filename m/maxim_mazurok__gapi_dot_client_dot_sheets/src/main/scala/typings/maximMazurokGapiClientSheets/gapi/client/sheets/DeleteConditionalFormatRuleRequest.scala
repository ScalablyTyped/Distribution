package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConditionalFormatRuleRequest extends StObject {
  
  /** The zero-based index of the rule to be deleted. */
  var index: js.UndefOr[Double] = js.undefined
  
  /** The sheet the rule is being deleted from. */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object DeleteConditionalFormatRuleRequest {
  
  inline def apply(): DeleteConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConditionalFormatRuleRequest]
  }
  
  extension [Self <: DeleteConditionalFormatRuleRequest](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
