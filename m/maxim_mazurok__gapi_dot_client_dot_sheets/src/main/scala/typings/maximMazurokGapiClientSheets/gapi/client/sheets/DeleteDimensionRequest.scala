package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDimensionRequest extends StObject {
  
  /** The dimensions to delete from the sheet. */
  var range: js.UndefOr[DimensionRange] = js.undefined
}
object DeleteDimensionRequest {
  
  @scala.inline
  def apply(): DeleteDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDimensionRequest]
  }
  
  @scala.inline
  implicit class DeleteDimensionRequestMutableBuilder[Self <: DeleteDimensionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
