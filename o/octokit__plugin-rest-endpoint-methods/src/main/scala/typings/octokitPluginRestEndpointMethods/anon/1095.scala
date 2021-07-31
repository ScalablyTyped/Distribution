package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1095` extends StObject {
  
  var parameters: RequestParameters & (Omit[UsersListPublicSshKeysForAuthenticatedEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]
}
object `1095` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[UsersListPublicSshKeysForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]
  ): `1095` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1095`]
  }
  
  @scala.inline
  implicit class `1095MutableBuilder`[Self <: `1095`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[UsersListPublicSshKeysForAuthenticatedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
