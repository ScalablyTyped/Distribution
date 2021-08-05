package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse201Data
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint
  
  var request: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions
  
  var response: OctokitResponse[
    OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse201Data
  ]
}
object ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint {
  
  inline def apply(
    parameters: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint,
    request: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions,
    response: OctokitResponse[
      OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse201Data
    ]
  ): ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint]
  }
  
  extension [Self <: ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint](x: Self) {
    
    inline def setParameters(value: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: OctokitResponse[
          OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse201Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
