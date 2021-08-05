package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListForksEndpoint
import typings.octokitTypes.endpointsMod.ReposListForksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListForksEndpoint extends StObject {
  
  var parameters: ReposListForksEndpoint
  
  var response: OctokitResponse[ReposListForksResponseData]
}
object ParametersReposListForksEndpoint {
  
  inline def apply(parameters: ReposListForksEndpoint, response: OctokitResponse[ReposListForksResponseData]): ParametersReposListForksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForksEndpoint]
  }
  
  extension [Self <: ParametersReposListForksEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListForksEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListForksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
