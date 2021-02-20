package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConditionalFormatRuleRequest extends StObject {
  
  /** The zero-based index of the rule to be deleted. */
  var index: js.UndefOr[Double] = js.native
  
  /** The sheet the rule is being deleted from. */
  var sheetId: js.UndefOr[Double] = js.native
}
object DeleteConditionalFormatRuleRequest {
  
  @scala.inline
  def apply(): DeleteConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConditionalFormatRuleRequest]
  }
  
  @scala.inline
  implicit class DeleteConditionalFormatRuleRequestMutableBuilder[Self <: DeleteConditionalFormatRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
