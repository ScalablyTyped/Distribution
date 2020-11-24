package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListSelfHostedRunnersForRepoEndpoint extends js.Object {
  
  var parameters: ActionsListSelfHostedRunnersForRepoEndpoint = js.native
  
  var response: OctokitResponse[ActionsListSelfHostedRunnersForRepoResponseData] with `0` = js.native
}
object ParametersActionsListSelfHostedRunnersForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersForRepoEndpoint,
    response: OctokitResponse[ActionsListSelfHostedRunnersForRepoResponseData] with `0`
  ): ParametersActionsListSelfHostedRunnersForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnersForRepoEndpointOps[Self <: ParametersActionsListSelfHostedRunnersForRepoEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsListSelfHostedRunnersForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersForRepoResponseData] with `0`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
