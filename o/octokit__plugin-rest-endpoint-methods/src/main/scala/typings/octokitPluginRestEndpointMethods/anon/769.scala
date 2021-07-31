package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsGetImportStatusEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetImportStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `769` extends StObject {
  
  var parameters: RequestParameters & (Omit[MigrationsGetImportStatusEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[MigrationsGetImportStatusResponseData]
}
object `769` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[MigrationsGetImportStatusEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsGetImportStatusResponseData]
  ): `769` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`769`]
  }
  
  @scala.inline
  implicit class `769MutableBuilder`[Self <: `769`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[MigrationsGetImportStatusEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetImportStatusResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
