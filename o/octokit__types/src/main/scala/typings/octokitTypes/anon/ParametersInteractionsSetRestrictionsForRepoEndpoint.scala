package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoEndpoint
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersInteractionsSetRestrictionsForRepoEndpoint extends StObject {
  
  var parameters: InteractionsSetRestrictionsForRepoEndpoint
  
  var request: InteractionsSetRestrictionsForRepoRequestOptions
  
  var response: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData]
}
object ParametersInteractionsSetRestrictionsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: InteractionsSetRestrictionsForRepoEndpoint,
    request: InteractionsSetRestrictionsForRepoRequestOptions,
    response: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData]
  ): ParametersInteractionsSetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsSetRestrictionsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersInteractionsSetRestrictionsForRepoEndpointMutableBuilder[Self <: ParametersInteractionsSetRestrictionsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: InteractionsSetRestrictionsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: InteractionsSetRestrictionsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[InteractionsSetRestrictionsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
