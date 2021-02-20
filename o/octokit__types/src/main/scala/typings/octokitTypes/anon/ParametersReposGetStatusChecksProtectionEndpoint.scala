package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetStatusChecksProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetStatusChecksProtectionEndpoint extends StObject {
  
  var parameters: ReposGetStatusChecksProtectionEndpoint = js.native
  
  var request: ReposGetStatusChecksProtectionRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetStatusChecksProtectionResponseData] = js.native
}
object ParametersReposGetStatusChecksProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetStatusChecksProtectionEndpoint,
    request: ReposGetStatusChecksProtectionRequestOptions,
    response: OctokitResponse[ReposGetStatusChecksProtectionResponseData]
  ): ParametersReposGetStatusChecksProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetStatusChecksProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetStatusChecksProtectionEndpointMutableBuilder[Self <: ParametersReposGetStatusChecksProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetStatusChecksProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetStatusChecksProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetStatusChecksProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
