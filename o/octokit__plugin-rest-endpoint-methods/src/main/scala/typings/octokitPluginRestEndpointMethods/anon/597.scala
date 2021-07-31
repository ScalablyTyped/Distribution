package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `597` extends StObject {
  
  var parameters: RequestParameters & (Omit[
    ActivityListNotificationsForAuthenticatedUserEndpoint, 
    baseUrl | headers | mediaType
  ])
  
  var response: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]
}
object `597` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[
      ActivityListNotificationsForAuthenticatedUserEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]
  ): `597` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`597`]
  }
  
  @scala.inline
  implicit class `597MutableBuilder`[Self <: `597`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[
          ActivityListNotificationsForAuthenticatedUserEndpoint, 
          baseUrl | headers | mediaType
        ])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
