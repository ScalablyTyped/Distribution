package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetUserAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposSetUserAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetUserAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposSetUserAccessRestrictionsEndpoint extends js.Object {
  
  var parameters: ReposSetUserAccessRestrictionsEndpoint = js.native
  
  var request: ReposSetUserAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposSetUserAccessRestrictionsResponseData] = js.native
}
object ParametersReposSetUserAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposSetUserAccessRestrictionsEndpoint,
    request: ReposSetUserAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposSetUserAccessRestrictionsResponseData]
  ): ParametersReposSetUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetUserAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposSetUserAccessRestrictionsEndpointOps[Self <: ParametersReposSetUserAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposSetUserAccessRestrictionsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposSetUserAccessRestrictionsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposSetUserAccessRestrictionsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
