package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2ListExecutionsResponse extends StObject {
  
  /** The resulting list of Executions. */
  var executions: js.UndefOr[js.Array[GoogleCloudRunV2Execution]] = js.undefined
  
  /** A token indicating there are more items than page_size. Use it in the next ListExecutions request to continue. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2ListExecutionsResponse {
  
  inline def apply(): GoogleCloudRunV2ListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2ListExecutionsResponse]
  }
  
  extension [Self <: GoogleCloudRunV2ListExecutionsResponse](x: Self) {
    
    inline def setExecutions(value: js.Array[GoogleCloudRunV2Execution]): Self = StObject.set(x, "executions", value.asInstanceOf[js.Any])
    
    inline def setExecutionsUndefined: Self = StObject.set(x, "executions", js.undefined)
    
    inline def setExecutionsVarargs(value: GoogleCloudRunV2Execution*): Self = StObject.set(x, "executions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
