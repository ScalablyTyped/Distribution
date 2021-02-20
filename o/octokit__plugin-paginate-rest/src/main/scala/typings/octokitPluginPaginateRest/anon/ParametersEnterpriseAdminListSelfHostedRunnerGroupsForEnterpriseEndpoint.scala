package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint = js.native
  
  var response: OctokitResponse[EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData] with Data = js.native
}
object ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint,
    response: OctokitResponse[EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData] with Data
  ): ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseResponseData] with Data
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
