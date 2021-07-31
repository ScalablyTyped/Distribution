package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsListInvitationTeamsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListInvitationTeamsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `802` extends StObject {
  
  var parameters: RequestParameters & (Omit[OrgsListInvitationTeamsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[OrgsListInvitationTeamsResponseData]
}
object `802` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[OrgsListInvitationTeamsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListInvitationTeamsResponseData]
  ): `802` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`802`]
  }
  
  @scala.inline
  implicit class `802MutableBuilder`[Self <: `802`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[OrgsListInvitationTeamsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListInvitationTeamsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
