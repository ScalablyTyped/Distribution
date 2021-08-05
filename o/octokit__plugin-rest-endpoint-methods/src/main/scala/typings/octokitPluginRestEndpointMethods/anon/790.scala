package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsCreateInvitationEndpoint
import typings.octokitTypes.endpointsMod.OrgsCreateInvitationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `790` extends StObject {
  
  var parameters: RequestParameters & (Omit[OrgsCreateInvitationEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[OrgsCreateInvitationResponseData]
}
object `790` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[OrgsCreateInvitationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsCreateInvitationResponseData]
  ): `790` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`790`]
  }
  
  extension [Self <: `790`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[OrgsCreateInvitationEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsCreateInvitationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
