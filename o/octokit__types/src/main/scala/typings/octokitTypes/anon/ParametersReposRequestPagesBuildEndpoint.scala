package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRequestPagesBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposRequestPagesBuildRequestOptions
import typings.octokitTypes.endpointsMod.ReposRequestPagesBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposRequestPagesBuildEndpoint extends StObject {
  
  var parameters: ReposRequestPagesBuildEndpoint
  
  var request: ReposRequestPagesBuildRequestOptions
  
  var response: OctokitResponse[ReposRequestPagesBuildResponseData]
}
object ParametersReposRequestPagesBuildEndpoint {
  
  inline def apply(
    parameters: ReposRequestPagesBuildEndpoint,
    request: ReposRequestPagesBuildRequestOptions,
    response: OctokitResponse[ReposRequestPagesBuildResponseData]
  ): ParametersReposRequestPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRequestPagesBuildEndpoint]
  }
  
  extension [Self <: ParametersReposRequestPagesBuildEndpoint](x: Self) {
    
    inline def setParameters(value: ReposRequestPagesBuildEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposRequestPagesBuildRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposRequestPagesBuildResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
