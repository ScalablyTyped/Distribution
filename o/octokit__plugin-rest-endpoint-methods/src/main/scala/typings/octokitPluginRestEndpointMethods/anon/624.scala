package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `624` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsCreateInstallationAccessTokenEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsCreateInstallationAccessTokenResponseData]
}
object `624` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[AppsCreateInstallationAccessTokenEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsCreateInstallationAccessTokenResponseData]
  ): `624` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`624`]
  }
  
  @scala.inline
  implicit class `624MutableBuilder`[Self <: `624`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[AppsCreateInstallationAccessTokenEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCreateInstallationAccessTokenResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
