package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsStartImportEndpoint
import typings.octokitTypes.endpointsMod.MigrationsStartImportResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `781` extends StObject {
  
  var parameters: RequestParameters & (Omit[MigrationsStartImportEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[MigrationsStartImportResponseData]
}
object `781` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[MigrationsStartImportEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsStartImportResponseData]
  ): `781` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`781`]
  }
  
  extension [Self <: `781`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[MigrationsStartImportEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MigrationsStartImportResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
