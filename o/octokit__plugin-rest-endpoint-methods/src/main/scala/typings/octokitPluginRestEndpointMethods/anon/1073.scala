package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1073` extends StObject {
  
  var parameters: RequestParameters & (Omit[UsersCreateGpgKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]
}
object `1073` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[UsersCreateGpgKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]
  ): `1073` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1073`]
  }
  
  @scala.inline
  implicit class `1073MutableBuilder`[Self <: `1073`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[UsersCreateGpgKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
