package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteDeployKeyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDeleteDeployKeyEndpoint extends StObject {
  
  var parameters: ReposDeleteDeployKeyEndpoint
  
  var request: ReposDeleteDeployKeyRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDeleteDeployKeyEndpoint {
  
  inline def apply(
    parameters: ReposDeleteDeployKeyEndpoint,
    request: ReposDeleteDeployKeyRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDeleteDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteDeployKeyEndpoint]
  }
  
  extension [Self <: ParametersReposDeleteDeployKeyEndpoint](x: Self) {
    
    inline def setParameters(value: ReposDeleteDeployKeyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposDeleteDeployKeyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
