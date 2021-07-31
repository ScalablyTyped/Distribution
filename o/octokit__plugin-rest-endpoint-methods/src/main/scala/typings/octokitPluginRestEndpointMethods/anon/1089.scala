package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListFollowersForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowersForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1089` extends StObject {
  
  var parameters: RequestParameters & (Omit[UsersListFollowersForUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[UsersListFollowersForUserResponseData]
}
object `1089` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[UsersListFollowersForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListFollowersForUserResponseData]
  ): `1089` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1089`]
  }
  
  @scala.inline
  implicit class `1089MutableBuilder`[Self <: `1089`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[UsersListFollowersForUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowersForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
