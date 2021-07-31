package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1ExplainRequest extends StObject {
  
  /** Required. The explanation request body. */
  var httpBody: js.UndefOr[GoogleApiHttpBody] = js.undefined
}
object GoogleCloudMlV1ExplainRequest {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ExplainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ExplainRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ExplainRequestMutableBuilder[Self <: GoogleCloudMlV1ExplainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpBody(value: GoogleApiHttpBody): Self = StObject.set(x, "httpBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpBodyUndefined: Self = StObject.set(x, "httpBody", js.undefined)
  }
}
