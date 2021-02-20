package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetCommitEndpoint extends StObject {
  
  var parameters: ReposGetCommitEndpoint = js.native
  
  var request: ReposGetCommitRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetCommitResponseData] = js.native
}
object ParametersReposGetCommitEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetCommitEndpoint,
    request: ReposGetCommitRequestOptions,
    response: OctokitResponse[ReposGetCommitResponseData]
  ): ParametersReposGetCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommitEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetCommitEndpointMutableBuilder[Self <: ParametersReposGetCommitEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetCommitEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetCommitRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
