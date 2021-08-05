package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1ExplainRequest extends StObject {
  
  /** Required. The explanation request body. */
  var httpBody: js.UndefOr[GoogleApiHttpBody] = js.undefined
}
object GoogleCloudMlV1ExplainRequest {
  
  inline def apply(): GoogleCloudMlV1ExplainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ExplainRequest]
  }
  
  extension [Self <: GoogleCloudMlV1ExplainRequest](x: Self) {
    
    inline def setHttpBody(value: GoogleApiHttpBody): Self = StObject.set(x, "httpBody", value.asInstanceOf[js.Any])
    
    inline def setHttpBodyUndefined: Self = StObject.set(x, "httpBody", js.undefined)
  }
}
