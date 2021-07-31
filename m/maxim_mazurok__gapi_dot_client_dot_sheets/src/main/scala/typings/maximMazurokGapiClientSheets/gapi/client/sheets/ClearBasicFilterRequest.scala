package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearBasicFilterRequest extends StObject {
  
  /** The sheet ID on which the basic filter should be cleared. */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object ClearBasicFilterRequest {
  
  @scala.inline
  def apply(): ClearBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearBasicFilterRequest]
  }
  
  @scala.inline
  implicit class ClearBasicFilterRequestMutableBuilder[Self <: ClearBasicFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
