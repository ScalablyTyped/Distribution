package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersInteractionsSetRestrictionsForOrgEndpoint extends StObject {
  
  var parameters: InteractionsSetRestrictionsForOrgEndpoint = js.native
  
  var request: InteractionsSetRestrictionsForOrgRequestOptions = js.native
  
  var response: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData] = js.native
}
object ParametersInteractionsSetRestrictionsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: InteractionsSetRestrictionsForOrgEndpoint,
    request: InteractionsSetRestrictionsForOrgRequestOptions,
    response: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]
  ): ParametersInteractionsSetRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsSetRestrictionsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersInteractionsSetRestrictionsForOrgEndpointMutableBuilder[Self <: ParametersInteractionsSetRestrictionsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: InteractionsSetRestrictionsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: InteractionsSetRestrictionsForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
