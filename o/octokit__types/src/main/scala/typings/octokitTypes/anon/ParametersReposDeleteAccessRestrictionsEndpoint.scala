package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteAccessRestrictionsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteAccessRestrictionsEndpoint extends js.Object {
  
  var parameters: ReposDeleteAccessRestrictionsEndpoint = js.native
  
  var request: ReposDeleteAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeleteAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteAccessRestrictionsEndpoint,
    request: ReposDeleteAccessRestrictionsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteAccessRestrictionsEndpointOps[Self <: ParametersReposDeleteAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposDeleteAccessRestrictionsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteAccessRestrictionsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
