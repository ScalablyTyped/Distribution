package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint
  
  var request: OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions
  
  var response: OctokitResponse[
    OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
  ]
}
object ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint {
  
  inline def apply(
    parameters: OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint,
    request: OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions,
    response: OctokitResponse[
      OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
    ]
  ): ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint]
  }
  
  extension [Self <: ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint](x: Self) {
    
    inline def setParameters(value: OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: OctokitResponse[
          OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
