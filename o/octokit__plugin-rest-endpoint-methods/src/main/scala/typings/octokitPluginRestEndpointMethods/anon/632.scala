package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetRepoInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetRepoInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `632` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsGetRepoInstallationEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsGetRepoInstallationResponseData]
}
object `632` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[AppsGetRepoInstallationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetRepoInstallationResponseData]
  ): `632` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`632`]
  }
  
  @scala.inline
  implicit class `632MutableBuilder`[Self <: `632`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[AppsGetRepoInstallationEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetRepoInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
