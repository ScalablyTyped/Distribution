package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListDeployKeysEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeployKeysResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListDeployKeysEndpoint extends StObject {
  
  var parameters: ReposListDeployKeysEndpoint
  
  var response: OctokitResponse[ReposListDeployKeysResponseData]
}
object ParametersReposListDeployKeysEndpoint {
  
  inline def apply(
    parameters: ReposListDeployKeysEndpoint,
    response: OctokitResponse[ReposListDeployKeysResponseData]
  ): ParametersReposListDeployKeysEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListDeployKeysEndpoint]
  }
  
  extension [Self <: ParametersReposListDeployKeysEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListDeployKeysEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListDeployKeysResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
