package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposAddAppAccessRestrictionsEndpoint extends js.Object {
  
  var parameters: ReposAddAppAccessRestrictionsEndpoint = js.native
  
  var request: ReposAddAppAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposAddAppAccessRestrictionsResponseData] = js.native
}
object ParametersReposAddAppAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposAddAppAccessRestrictionsEndpoint,
    request: ReposAddAppAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddAppAccessRestrictionsResponseData]
  ): ParametersReposAddAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddAppAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposAddAppAccessRestrictionsEndpointOps[Self <: ParametersReposAddAppAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposAddAppAccessRestrictionsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposAddAppAccessRestrictionsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposAddAppAccessRestrictionsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
