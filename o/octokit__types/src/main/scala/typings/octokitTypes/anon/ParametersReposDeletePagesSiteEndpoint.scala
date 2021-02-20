package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeletePagesSiteEndpoint
import typings.octokitTypes.endpointsMod.ReposDeletePagesSiteRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeletePagesSiteEndpoint extends StObject {
  
  var parameters: ReposDeletePagesSiteEndpoint = js.native
  
  var request: ReposDeletePagesSiteRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeletePagesSiteEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeletePagesSiteEndpoint,
    request: ReposDeletePagesSiteRequestOptions,
    response: OctokitResponse[_]
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
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
