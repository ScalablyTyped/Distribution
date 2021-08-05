package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsStartForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsStartForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `780` extends StObject {
  
  var parameters: RequestParameters & (Omit[MigrationsStartForOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[MigrationsStartForOrgResponseData]
}
object `780` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[MigrationsStartForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsStartForOrgResponseData]
  ): `780` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`780`]
  }
  
  extension [Self <: `780`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[MigrationsStartForOrgEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MigrationsStartForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
