package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsListPendingInvitationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListPendingInvitationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `806` extends StObject {
  
  var parameters: RequestParameters & (Omit[OrgsListPendingInvitationsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[OrgsListPendingInvitationsResponseData]
}
object `806` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[OrgsListPendingInvitationsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListPendingInvitationsResponseData]
  ): `806` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`806`]
  }
  
  @scala.inline
  implicit class `806MutableBuilder`[Self <: `806`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[OrgsListPendingInvitationsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListPendingInvitationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
