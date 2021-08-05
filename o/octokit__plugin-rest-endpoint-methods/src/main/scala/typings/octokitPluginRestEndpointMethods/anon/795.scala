package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `795` extends StObject {
  
  var parameters: RequestParameters & (Omit[OrgsGetMembershipForUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[OrgsGetMembershipForUserResponseData]
}
object `795` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[OrgsGetMembershipForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsGetMembershipForUserResponseData]
  ): `795` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`795`]
  }
  
  extension [Self <: `795`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[OrgsGetMembershipForUserEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsGetMembershipForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
