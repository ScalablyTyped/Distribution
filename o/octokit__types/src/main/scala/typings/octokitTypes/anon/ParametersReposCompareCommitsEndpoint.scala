package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCompareCommitsEndpoint
import typings.octokitTypes.endpointsMod.ReposCompareCommitsRequestOptions
import typings.octokitTypes.endpointsMod.ReposCompareCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCompareCommitsEndpoint extends StObject {
  
  var parameters: ReposCompareCommitsEndpoint = js.native
  
  var request: ReposCompareCommitsRequestOptions = js.native
  
  var response: OctokitResponse[ReposCompareCommitsResponseData] = js.native
}
object ParametersReposCompareCommitsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCompareCommitsEndpoint,
    request: ReposCompareCommitsRequestOptions,
    response: OctokitResponse[ReposCompareCommitsResponseData]
  ): ParametersReposCompareCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCompareCommitsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCompareCommitsEndpointMutableBuilder[Self <: ParametersReposCompareCommitsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCompareCommitsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCompareCommitsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCompareCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
