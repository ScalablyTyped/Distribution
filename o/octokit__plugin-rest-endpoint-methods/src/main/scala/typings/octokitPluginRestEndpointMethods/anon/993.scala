package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `993` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListInvitationsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]
}
object `993` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposListInvitationsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]
  ): `993` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`993`]
  }
  
  extension [Self <: `993`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposListInvitationsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
