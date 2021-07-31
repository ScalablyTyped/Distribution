package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `643` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsListReposAccessibleToInstallationEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData]
}
object `643` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[AppsListReposAccessibleToInstallationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData]
  ): `643` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`643`]
  }
  
  @scala.inline
  implicit class `643MutableBuilder`[Self <: `643`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[AppsListReposAccessibleToInstallationEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListReposAccessibleToInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
