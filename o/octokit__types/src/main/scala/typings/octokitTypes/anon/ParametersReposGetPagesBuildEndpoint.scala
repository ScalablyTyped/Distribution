package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetPagesBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPagesBuildRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetPagesBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetPagesBuildEndpoint extends StObject {
  
  var parameters: ReposGetPagesBuildEndpoint
  
  var request: ReposGetPagesBuildRequestOptions
  
  var response: OctokitResponse[ReposGetPagesBuildResponseData]
}
object ParametersReposGetPagesBuildEndpoint {
  
  inline def apply(
    parameters: ReposGetPagesBuildEndpoint,
    request: ReposGetPagesBuildRequestOptions,
    response: OctokitResponse[ReposGetPagesBuildResponseData]
  ): ParametersReposGetPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPagesBuildEndpoint]
  }
  
  extension [Self <: ParametersReposGetPagesBuildEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetPagesBuildEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetPagesBuildRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetPagesBuildResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
