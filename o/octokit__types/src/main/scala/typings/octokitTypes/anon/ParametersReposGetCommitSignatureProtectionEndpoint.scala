package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetCommitSignatureProtectionEndpoint extends StObject {
  
  var parameters: ReposGetCommitSignatureProtectionEndpoint = js.native
  
  var request: ReposGetCommitSignatureProtectionRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetCommitSignatureProtectionResponseData] = js.native
}
object ParametersReposGetCommitSignatureProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetCommitSignatureProtectionEndpoint,
    request: ReposGetCommitSignatureProtectionRequestOptions,
    response: OctokitResponse[ReposGetCommitSignatureProtectionResponseData]
  ): ParametersReposGetCommitSignatureProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommitSignatureProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetCommitSignatureProtectionEndpointMutableBuilder[Self <: ParametersReposGetCommitSignatureProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetCommitSignatureProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetCommitSignatureProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommitSignatureProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
