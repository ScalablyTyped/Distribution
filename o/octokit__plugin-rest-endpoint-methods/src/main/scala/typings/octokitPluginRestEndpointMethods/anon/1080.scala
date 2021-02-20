package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersGetByUsernameEndpoint
import typings.octokitTypes.endpointsMod.UsersGetByUsernameResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1080` extends StObject {
  
  var parameters: RequestParameters with (Omit[UsersGetByUsernameEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[UsersGetByUsernameResponseData] = js.native
}
object `1080` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersGetByUsernameEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersGetByUsernameResponseData]
  ): `1080` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1080`]
  }
  
  @scala.inline
  implicit class `1080MutableBuilder`[Self <: `1080`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[UsersGetByUsernameEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetByUsernameResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
