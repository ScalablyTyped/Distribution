package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposUpdateReleaseEndpoint extends StObject {
  
  var parameters: ReposUpdateReleaseEndpoint
  
  var request: ReposUpdateReleaseRequestOptions
  
  var response: OctokitResponse[ReposUpdateReleaseResponseData]
}
object ParametersReposUpdateReleaseEndpoint {
  
  inline def apply(
    parameters: ReposUpdateReleaseEndpoint,
    request: ReposUpdateReleaseRequestOptions,
    response: OctokitResponse[ReposUpdateReleaseResponseData]
  ): ParametersReposUpdateReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateReleaseEndpoint]
  }
  
  extension [Self <: ParametersReposUpdateReleaseEndpoint](x: Self) {
    
    inline def setParameters(value: ReposUpdateReleaseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposUpdateReleaseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposUpdateReleaseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
