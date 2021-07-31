package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1086` extends StObject {
  
  var parameters: RequestParameters & (Omit[UsersListEmailsForAuthenticatedEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]
}
object `1086` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[UsersListEmailsForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]
  ): `1086` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1086`]
  }
  
  @scala.inline
  implicit class `1086MutableBuilder`[Self <: `1086`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[UsersListEmailsForAuthenticatedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
