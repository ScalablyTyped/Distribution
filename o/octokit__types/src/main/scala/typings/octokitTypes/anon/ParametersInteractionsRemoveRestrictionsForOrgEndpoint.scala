package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersInteractionsRemoveRestrictionsForOrgEndpoint extends StObject {
  
  var parameters: InteractionsRemoveRestrictionsForOrgEndpoint = js.native
  
  var request: InteractionsRemoveRestrictionsForOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersInteractionsRemoveRestrictionsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: InteractionsRemoveRestrictionsForOrgEndpoint,
    request: InteractionsRemoveRestrictionsForOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersInteractionsRemoveRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsRemoveRestrictionsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersInteractionsRemoveRestrictionsForOrgEndpointMutableBuilder[Self <: ParametersInteractionsRemoveRestrictionsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: InteractionsRemoveRestrictionsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: InteractionsRemoveRestrictionsForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
