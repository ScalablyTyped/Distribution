package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `804` extends StObject {
  
  var parameters: RequestParameters & (Omit[OrgsListMembershipsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]
}
object `804` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[OrgsListMembershipsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]
  ): `804` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`804`]
  }
  
  @scala.inline
  implicit class `804MutableBuilder`[Self <: `804`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[OrgsListMembershipsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
