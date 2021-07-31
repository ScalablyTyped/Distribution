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
  
  @scala.inline
  def apply(
    parameters: ReposDeletePagesSiteEndpoint,
    request: ReposDeletePagesSiteRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDeletePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeletePagesSiteEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeletePagesSiteEndpointMutableBuilder[Self <: ParametersReposDeletePagesSiteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeletePagesSiteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeletePagesSiteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
