package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsMapCommitAuthorEndpoint
import typings.octokitTypes.endpointsMod.MigrationsMapCommitAuthorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `777` extends StObject {
  
  var parameters: RequestParameters & (Omit[MigrationsMapCommitAuthorEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[MigrationsMapCommitAuthorResponseData]
}
object `777` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[MigrationsMapCommitAuthorEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsMapCommitAuthorResponseData]
  ): `777` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`777`]
  }
  
  extension [Self <: `777`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[MigrationsMapCommitAuthorEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MigrationsMapCommitAuthorResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
