package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1PredictRequest extends StObject {
  
  /** Required. The prediction request body. Refer to the [request body details section](#request-body-details) for more information on how to structure your request. */
  var httpBody: js.UndefOr[GoogleApiHttpBody] = js.undefined
}
object GoogleCloudMlV1PredictRequest {
  
  inline def apply(): GoogleCloudMlV1PredictRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1PredictRequest]
  }
  
  extension [Self <: GoogleCloudMlV1PredictRequest](x: Self) {
    
    inline def setHttpBody(value: GoogleApiHttpBody): Self = StObject.set(x, "httpBody", value.asInstanceOf[js.Any])
    
    inline def setHttpBodyUndefined: Self = StObject.set(x, "httpBody", js.undefined)
  }
}
