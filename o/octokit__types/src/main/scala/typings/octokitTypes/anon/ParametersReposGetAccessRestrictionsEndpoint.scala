package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetAccessRestrictionsEndpoint extends js.Object {
  
  var parameters: ReposGetAccessRestrictionsEndpoint = js.native
  
  var request: ReposGetAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetAccessRestrictionsResponseData] = js.native
}
object ParametersReposGetAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetAccessRestrictionsEndpoint,
    request: ReposGetAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposGetAccessRestrictionsResponseData]
  ): ParametersReposGetAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetAccessRestrictionsEndpointOps[Self <: ParametersReposGetAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetAccessRestrictionsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetAccessRestrictionsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAccessRestrictionsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
