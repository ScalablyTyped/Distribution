package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddUserAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddUserAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddUserAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposAddUserAccessRestrictionsEndpoint extends js.Object {
  
  var parameters: ReposAddUserAccessRestrictionsEndpoint = js.native
  
  var request: ReposAddUserAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposAddUserAccessRestrictionsResponseData] = js.native
}
object ParametersReposAddUserAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposAddUserAccessRestrictionsEndpoint,
    request: ReposAddUserAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddUserAccessRestrictionsResponseData]
  ): ParametersReposAddUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddUserAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposAddUserAccessRestrictionsEndpointOps[Self <: ParametersReposAddUserAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposAddUserAccessRestrictionsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposAddUserAccessRestrictionsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposAddUserAccessRestrictionsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
