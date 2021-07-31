package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `611` extends StObject {
  
  var parameters: RequestParameters & (Omit[
    ActivityListWatchedReposForAuthenticatedUserEndpoint, 
    baseUrl | headers | mediaType
  ])
  
  var response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]
}
object `611` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[
      ActivityListWatchedReposForAuthenticatedUserEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]
  ): `611` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`611`]
  }
  
  @scala.inline
  implicit class `611MutableBuilder`[Self <: `611`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[
          ActivityListWatchedReposForAuthenticatedUserEndpoint, 
          baseUrl | headers | mediaType
        ])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
