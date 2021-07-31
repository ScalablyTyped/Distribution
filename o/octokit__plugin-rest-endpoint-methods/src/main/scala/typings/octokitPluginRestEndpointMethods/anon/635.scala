package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetUserInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetUserInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `635` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsGetUserInstallationEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsGetUserInstallationResponseData]
}
object `635` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[AppsGetUserInstallationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetUserInstallationResponseData]
  ): `635` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`635`]
  }
  
  @scala.inline
  implicit class `635MutableBuilder`[Self <: `635`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[AppsGetUserInstallationEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetUserInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
