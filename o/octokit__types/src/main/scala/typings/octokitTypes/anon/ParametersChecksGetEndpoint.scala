package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksGetEndpoint
import typings.octokitTypes.endpointsMod.ChecksGetRequestOptions
import typings.octokitTypes.endpointsMod.ChecksGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersChecksGetEndpoint extends StObject {
  
  var parameters: ChecksGetEndpoint
  
  var request: ChecksGetRequestOptions
  
  var response: OctokitResponse[ChecksGetResponseData]
}
object ParametersChecksGetEndpoint {
  
  inline def apply(
    parameters: ChecksGetEndpoint,
    request: ChecksGetRequestOptions,
    response: OctokitResponse[ChecksGetResponseData]
  ): ParametersChecksGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksGetEndpoint]
  }
  
  extension [Self <: ParametersChecksGetEndpoint](x: Self) {
    
    inline def setParameters(value: ChecksGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ChecksGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ChecksGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
