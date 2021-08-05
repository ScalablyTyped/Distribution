package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsListGrantsEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListGrantsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  var parameters: OauthAuthorizationsListGrantsEndpoint
  
  var response: OctokitResponse[OauthAuthorizationsListGrantsResponseData]
}
object Response {
  
  inline def apply(
    parameters: OauthAuthorizationsListGrantsEndpoint,
    response: OctokitResponse[OauthAuthorizationsListGrantsResponseData]
  ): Response = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  extension [Self <: Response](x: Self) {
    
    inline def setParameters(value: OauthAuthorizationsListGrantsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OauthAuthorizationsListGrantsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
