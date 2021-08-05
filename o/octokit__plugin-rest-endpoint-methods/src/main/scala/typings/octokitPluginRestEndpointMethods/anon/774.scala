package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsListForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `774` extends StObject {
  
  var parameters: RequestParameters & (Omit[MigrationsListForOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[MigrationsListForOrgResponseData]
}
object `774` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[MigrationsListForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsListForOrgResponseData]
  ): `774` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`774`]
  }
  
  extension [Self <: `774`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[MigrationsListForOrgEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MigrationsListForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
