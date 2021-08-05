package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `772` extends StObject {
  
  var parameters: RequestParameters & (Omit[MigrationsGetStatusForOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[MigrationsGetStatusForOrgResponseData]
}
object `772` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[MigrationsGetStatusForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsGetStatusForOrgResponseData]
  ): `772` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`772`]
  }
  
  extension [Self <: `772`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[MigrationsGetStatusForOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MigrationsGetStatusForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
