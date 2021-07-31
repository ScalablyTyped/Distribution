package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListPublicKeysForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicKeysForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1094` extends StObject {
  
  var parameters: RequestParameters & (Omit[UsersListPublicKeysForUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[UsersListPublicKeysForUserResponseData]
}
object `1094` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[UsersListPublicKeysForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListPublicKeysForUserResponseData]
  ): `1094` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1094`]
  }
  
  @scala.inline
  implicit class `1094MutableBuilder`[Self <: `1094`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[UsersListPublicKeysForUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListPublicKeysForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
