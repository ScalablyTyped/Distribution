package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsListReposForUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListReposForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `776` extends StObject {
  
  var parameters: RequestParameters & (Omit[MigrationsListReposForUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[MigrationsListReposForUserResponseData]
}
object `776` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[MigrationsListReposForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsListReposForUserResponseData]
  ): `776` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`776`]
  }
  
  extension [Self <: `776`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[MigrationsListReposForUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MigrationsListReposForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
