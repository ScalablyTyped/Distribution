package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshSheetsChartRequest extends StObject {
  
  /** The object ID of the chart to refresh. */
  var objectId: js.UndefOr[String] = js.undefined
}
object RefreshSheetsChartRequest {
  
  inline def apply(): RefreshSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshSheetsChartRequest]
  }
  
  extension [Self <: RefreshSheetsChartRequest](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
