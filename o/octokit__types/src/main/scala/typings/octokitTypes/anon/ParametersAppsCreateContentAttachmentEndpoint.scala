package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentRequestOptions
import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsCreateContentAttachmentEndpoint extends StObject {
  
  var parameters: AppsCreateContentAttachmentEndpoint
  
  var request: AppsCreateContentAttachmentRequestOptions
  
  var response: OctokitResponse[AppsCreateContentAttachmentResponseData]
}
object ParametersAppsCreateContentAttachmentEndpoint {
  
  inline def apply(
    parameters: AppsCreateContentAttachmentEndpoint,
    request: AppsCreateContentAttachmentRequestOptions,
    response: OctokitResponse[AppsCreateContentAttachmentResponseData]
  ): ParametersAppsCreateContentAttachmentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCreateContentAttachmentEndpoint]
  }
  
  extension [Self <: ParametersAppsCreateContentAttachmentEndpoint](x: Self) {
    
    inline def setParameters(value: AppsCreateContentAttachmentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsCreateContentAttachmentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[AppsCreateContentAttachmentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
