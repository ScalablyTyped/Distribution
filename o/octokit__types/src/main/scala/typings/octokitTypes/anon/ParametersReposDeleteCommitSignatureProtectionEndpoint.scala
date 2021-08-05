package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteCommitSignatureProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteCommitSignatureProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDeleteCommitSignatureProtectionEndpoint extends StObject {
  
  var parameters: ReposDeleteCommitSignatureProtectionEndpoint
  
  var request: ReposDeleteCommitSignatureProtectionRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDeleteCommitSignatureProtectionEndpoint {
  
  inline def apply(
    parameters: ReposDeleteCommitSignatureProtectionEndpoint,
    request: ReposDeleteCommitSignatureProtectionRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDeleteCommitSignatureProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteCommitSignatureProtectionEndpoint]
  }
  
  extension [Self <: ParametersReposDeleteCommitSignatureProtectionEndpoint](x: Self) {
    
    inline def setParameters(value: ReposDeleteCommitSignatureProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposDeleteCommitSignatureProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
