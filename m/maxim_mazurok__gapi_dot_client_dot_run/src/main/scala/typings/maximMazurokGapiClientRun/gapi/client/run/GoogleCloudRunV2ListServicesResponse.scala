package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2ListServicesResponse extends StObject {
  
  /** A token indicating there are more items than page_size. Use it in the next ListServices request to continue. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The resulting list of Services. */
  var services: js.UndefOr[js.Array[GoogleCloudRunV2Service]] = js.undefined
}
object GoogleCloudRunV2ListServicesResponse {
  
  inline def apply(): GoogleCloudRunV2ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2ListServicesResponse]
  }
  
  extension [Self <: GoogleCloudRunV2ListServicesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setServices(value: js.Array[GoogleCloudRunV2Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: GoogleCloudRunV2Service*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
