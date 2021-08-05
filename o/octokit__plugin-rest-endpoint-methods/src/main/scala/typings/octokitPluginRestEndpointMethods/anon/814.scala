package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsSetMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsSetMembershipForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `814` extends StObject {
  
  var parameters: RequestParameters & (Omit[OrgsSetMembershipForUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[OrgsSetMembershipForUserResponseData]
}
object `814` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[OrgsSetMembershipForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsSetMembershipForUserResponseData]
  ): `814` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`814`]
  }
  
  extension [Self <: `814`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[OrgsSetMembershipForUserEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsSetMembershipForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
