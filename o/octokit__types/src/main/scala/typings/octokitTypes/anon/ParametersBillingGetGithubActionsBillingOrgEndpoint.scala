package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingOrgEndpoint
import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingOrgRequestOptions
import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersBillingGetGithubActionsBillingOrgEndpoint extends StObject {
  
  var parameters: BillingGetGithubActionsBillingOrgEndpoint = js.native
  
  var request: BillingGetGithubActionsBillingOrgRequestOptions = js.native
  
  var response: OctokitResponse[BillingGetGithubActionsBillingOrgResponseData] = js.native
}
object ParametersBillingGetGithubActionsBillingOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: BillingGetGithubActionsBillingOrgEndpoint,
    request: BillingGetGithubActionsBillingOrgRequestOptions,
    response: OctokitResponse[BillingGetGithubActionsBillingOrgResponseData]
  ): ParametersBillingGetGithubActionsBillingOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetGithubActionsBillingOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersBillingGetGithubActionsBillingOrgEndpointMutableBuilder[Self <: ParametersBillingGetGithubActionsBillingOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: BillingGetGithubActionsBillingOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: BillingGetGithubActionsBillingOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetGithubActionsBillingOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
