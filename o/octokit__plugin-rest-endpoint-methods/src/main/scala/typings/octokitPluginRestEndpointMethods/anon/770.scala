package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsGetLargeFilesEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetLargeFilesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `770` extends StObject {
  
  var parameters: RequestParameters & (Omit[MigrationsGetLargeFilesEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[MigrationsGetLargeFilesResponseData]
}
object `770` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[MigrationsGetLargeFilesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsGetLargeFilesResponseData]
  ): `770` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`770`]
  }
  
  @scala.inline
  implicit class `770MutableBuilder`[Self <: `770`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[MigrationsGetLargeFilesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetLargeFilesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
