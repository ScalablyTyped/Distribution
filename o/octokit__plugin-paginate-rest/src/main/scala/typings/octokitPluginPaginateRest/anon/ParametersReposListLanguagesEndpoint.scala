package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListLanguagesEndpoint
import typings.octokitTypes.endpointsMod.ReposListLanguagesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListLanguagesEndpoint extends StObject {
  
  var parameters: ReposListLanguagesEndpoint
  
  var response: OctokitResponse[ReposListLanguagesResponseData]
}
object ParametersReposListLanguagesEndpoint {
  
  inline def apply(parameters: ReposListLanguagesEndpoint, response: OctokitResponse[ReposListLanguagesResponseData]): ParametersReposListLanguagesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListLanguagesEndpoint]
  }
  
  extension [Self <: ParametersReposListLanguagesEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListLanguagesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListLanguagesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
