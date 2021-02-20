package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListSelfHostedRunnersForRepoEndpoint extends StObject {
  
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
  implicit class ParametersActionsListSelfHostedRunnersForRepoEndpointMutableBuilder[Self <: ParametersActionsListSelfHostedRunnersForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelfHostedRunnersForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersForRepoResponseData] with `0`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
