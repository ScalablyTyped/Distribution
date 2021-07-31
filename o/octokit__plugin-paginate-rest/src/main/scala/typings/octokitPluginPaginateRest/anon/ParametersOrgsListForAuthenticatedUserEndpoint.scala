package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: OrgsListForAuthenticatedUserEndpoint
  
  var response: OctokitResponse[OrgsListForAuthenticatedUserResponseData]
}
object ParametersOrgsListForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListForAuthenticatedUserEndpoint,
    response: OctokitResponse[OrgsListForAuthenticatedUserResponseData]
  ): ParametersOrgsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersOrgsListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
