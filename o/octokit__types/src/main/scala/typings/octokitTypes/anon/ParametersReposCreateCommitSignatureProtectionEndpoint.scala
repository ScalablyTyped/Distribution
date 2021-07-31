package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposCreateCommitSignatureProtectionEndpoint extends StObject {
  
  var parameters: ReposCreateCommitSignatureProtectionEndpoint
  
  var request: ReposCreateCommitSignatureProtectionRequestOptions
  
  var response: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]
}
object ParametersReposCreateCommitSignatureProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateCommitSignatureProtectionEndpoint,
    request: ReposCreateCommitSignatureProtectionRequestOptions,
    response: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]
  ): ParametersReposCreateCommitSignatureProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateCommitSignatureProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateCommitSignatureProtectionEndpointMutableBuilder[Self <: ParametersReposCreateCommitSignatureProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateCommitSignatureProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateCommitSignatureProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
