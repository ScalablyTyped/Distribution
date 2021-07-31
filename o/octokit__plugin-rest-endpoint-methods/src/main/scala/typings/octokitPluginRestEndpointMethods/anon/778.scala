package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceEndpoint
import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `778` extends StObject {
  
  var parameters: RequestParameters & (Omit[MigrationsSetLfsPreferenceEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[MigrationsSetLfsPreferenceResponseData]
}
object `778` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[MigrationsSetLfsPreferenceEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsSetLfsPreferenceResponseData]
  ): `778` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`778`]
  }
  
  @scala.inline
  implicit class `778MutableBuilder`[Self <: `778`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[MigrationsSetLfsPreferenceEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsSetLfsPreferenceResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
