package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `630` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsGetInstallationEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsGetInstallationResponseData]
}
object `630` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[AppsGetInstallationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetInstallationResponseData]
  ): `630` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`630`]
  }
  
  @scala.inline
  implicit class `630MutableBuilder`[Self <: `630`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[AppsGetInstallationEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
