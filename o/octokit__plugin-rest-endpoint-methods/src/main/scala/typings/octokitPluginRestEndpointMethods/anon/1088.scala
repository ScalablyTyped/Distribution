package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1088` extends StObject {
  
  var parameters: RequestParameters & (Omit[UsersListFollowersForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]
}
object `1088` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[UsersListFollowersForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]
  ): `1088` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1088`]
  }
  
  @scala.inline
  implicit class `1088MutableBuilder`[Self <: `1088`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[UsersListFollowersForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
