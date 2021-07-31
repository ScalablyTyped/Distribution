package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `771` extends StObject {
  
  var parameters: RequestParameters & (Omit[MigrationsGetStatusForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]
}
object `771` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[MigrationsGetStatusForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]
  ): `771` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`771`]
  }
  
  @scala.inline
  implicit class `771MutableBuilder`[Self <: `771`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[MigrationsGetStatusForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
