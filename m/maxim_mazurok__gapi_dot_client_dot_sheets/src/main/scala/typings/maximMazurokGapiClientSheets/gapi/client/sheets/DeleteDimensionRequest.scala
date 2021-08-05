package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDimensionRequest extends StObject {
  
  /** The dimensions to delete from the sheet. */
  var range: js.UndefOr[DimensionRange] = js.undefined
}
object DeleteDimensionRequest {
  
  inline def apply(): DeleteDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDimensionRequest]
  }
  
  extension [Self <: DeleteDimensionRequest](x: Self) {
    
    inline def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
