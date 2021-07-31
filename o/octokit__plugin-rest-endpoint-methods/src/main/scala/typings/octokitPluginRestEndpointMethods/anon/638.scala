package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationReposForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `638` extends StObject {
  
  var parameters: RequestParameters & (Omit[
    AppsListInstallationReposForAuthenticatedUserEndpoint, 
    baseUrl | headers | mediaType
  ])
  
  var response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData]
}
object `638` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[
      AppsListInstallationReposForAuthenticatedUserEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData]
  ): `638` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`638`]
  }
  
  @scala.inline
  implicit class `638MutableBuilder`[Self <: `638`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[
          AppsListInstallationReposForAuthenticatedUserEndpoint, 
          baseUrl | headers | mediaType
        ])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListInstallationReposForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
