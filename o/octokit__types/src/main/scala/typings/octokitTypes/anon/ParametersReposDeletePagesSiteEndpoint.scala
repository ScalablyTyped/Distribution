package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeletePagesSiteEndpoint
import typings.octokitTypes.endpointsMod.ReposDeletePagesSiteRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDeletePagesSiteEndpoint extends StObject {
  
  var parameters: ReposDeletePagesSiteEndpoint
  
  var request: ReposDeletePagesSiteRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDeletePagesSiteEndpoint {
  
  inline def apply(
    parameters: ReposDeletePagesSiteEndpoint,
    request: ReposDeletePagesSiteRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDeletePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeletePagesSiteEndpoint]
  }
  
  extension [Self <: ParametersReposDeletePagesSiteEndpoint](x: Self) {
    
    inline def setParameters(value: ReposDeletePagesSiteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposDeletePagesSiteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
