package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposSetAppAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposSetAppAccessRestrictionsEndpoint extends js.Object {
  
  var parameters: ReposSetAppAccessRestrictionsEndpoint = js.native
  
  var request: ReposSetAppAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposSetAppAccessRestrictionsResponseData] = js.native
}
object ParametersReposSetAppAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposSetAppAccessRestrictionsEndpoint,
    request: ReposSetAppAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposSetAppAccessRestrictionsResponseData]
  ): ParametersReposSetAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetAppAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposSetAppAccessRestrictionsEndpointOps[Self <: ParametersReposSetAppAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposSetAppAccessRestrictionsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposSetAppAccessRestrictionsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposSetAppAccessRestrictionsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
