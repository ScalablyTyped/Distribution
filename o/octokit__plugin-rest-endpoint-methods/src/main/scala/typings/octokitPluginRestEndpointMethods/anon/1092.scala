package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListGpgKeysForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListGpgKeysForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1092` extends StObject {
  
  var parameters: RequestParameters with (Omit[UsersListGpgKeysForUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[UsersListGpgKeysForUserResponseData] = js.native
}
object `1092` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListGpgKeysForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListGpgKeysForUserResponseData]
  ): `1092` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1092`]
  }
  
  @scala.inline
  implicit class `1092MutableBuilder`[Self <: `1092`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[UsersListGpgKeysForUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListGpgKeysForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
