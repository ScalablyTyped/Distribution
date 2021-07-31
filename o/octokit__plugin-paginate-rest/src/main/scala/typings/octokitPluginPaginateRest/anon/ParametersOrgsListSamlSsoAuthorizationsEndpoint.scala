package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListSamlSsoAuthorizationsEndpoint extends StObject {
  
  var parameters: OrgsListSamlSsoAuthorizationsEndpoint
  
  var response: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData]
}
object ParametersOrgsListSamlSsoAuthorizationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListSamlSsoAuthorizationsEndpoint,
    response: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData]
  ): ParametersOrgsListSamlSsoAuthorizationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListSamlSsoAuthorizationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListSamlSsoAuthorizationsEndpointMutableBuilder[Self <: ParametersOrgsListSamlSsoAuthorizationsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListSamlSsoAuthorizationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
