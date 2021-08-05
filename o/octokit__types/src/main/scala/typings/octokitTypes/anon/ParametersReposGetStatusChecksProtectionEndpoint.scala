package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetStatusChecksProtectionEndpoint extends StObject {
  
  var parameters: ReposGetStatusChecksProtectionEndpoint
  
  var request: ReposGetStatusChecksProtectionRequestOptions
  
  var response: OctokitResponse[ReposGetStatusChecksProtectionResponseData]
}
object ParametersReposGetStatusChecksProtectionEndpoint {
  
  inline def apply(
    parameters: ReposGetStatusChecksProtectionEndpoint,
    request: ReposGetStatusChecksProtectionRequestOptions,
    response: OctokitResponse[ReposGetStatusChecksProtectionResponseData]
  ): ParametersReposGetStatusChecksProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetStatusChecksProtectionEndpoint]
  }
  
  extension [Self <: ParametersReposGetStatusChecksProtectionEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetStatusChecksProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetStatusChecksProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetStatusChecksProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
