package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetReleaseEndpoint extends StObject {
  
  var parameters: ReposGetReleaseEndpoint
  
  var request: ReposGetReleaseRequestOptions
  
  var response: OctokitResponse[ReposGetReleaseResponseData]
}
object ParametersReposGetReleaseEndpoint {
  
  inline def apply(
    parameters: ReposGetReleaseEndpoint,
    request: ReposGetReleaseRequestOptions,
    response: OctokitResponse[ReposGetReleaseResponseData]
  ): ParametersReposGetReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReleaseEndpoint]
  }
  
  extension [Self <: ParametersReposGetReleaseEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetReleaseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetReleaseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetReleaseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
