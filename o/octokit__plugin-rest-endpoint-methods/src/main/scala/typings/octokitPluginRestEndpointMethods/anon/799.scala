package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsListBlockedUsersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListBlockedUsersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `799` extends StObject {
  
  var parameters: RequestParameters & (Omit[OrgsListBlockedUsersEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[OrgsListBlockedUsersResponseData]
}
object `799` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[OrgsListBlockedUsersEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListBlockedUsersResponseData]
  ): `799` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`799`]
  }
  
  @scala.inline
  implicit class `799MutableBuilder`[Self <: `799`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[OrgsListBlockedUsersEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListBlockedUsersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
