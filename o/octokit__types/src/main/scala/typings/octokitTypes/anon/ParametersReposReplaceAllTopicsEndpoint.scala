package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposReplaceAllTopicsEndpoint
import typings.octokitTypes.endpointsMod.ReposReplaceAllTopicsRequestOptions
import typings.octokitTypes.endpointsMod.ReposReplaceAllTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposReplaceAllTopicsEndpoint extends js.Object {
  
  var parameters: ReposReplaceAllTopicsEndpoint = js.native
  
  var request: ReposReplaceAllTopicsRequestOptions = js.native
  
  var response: OctokitResponse[ReposReplaceAllTopicsResponseData] = js.native
}
object ParametersReposReplaceAllTopicsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposReplaceAllTopicsEndpoint,
    request: ReposReplaceAllTopicsRequestOptions,
    response: OctokitResponse[ReposReplaceAllTopicsResponseData]
  ): ParametersReposReplaceAllTopicsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposReplaceAllTopicsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposReplaceAllTopicsEndpointOps[Self <: ParametersReposReplaceAllTopicsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: ReposReplaceAllTopicsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposReplaceAllTopicsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposReplaceAllTopicsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
