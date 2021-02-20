package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForRepoEndpoint
import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForRepoRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersInteractionsRemoveRestrictionsForRepoEndpoint extends StObject {
  
  var parameters: InteractionsRemoveRestrictionsForRepoEndpoint = js.native
  
  var request: InteractionsRemoveRestrictionsForRepoRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersInteractionsRemoveRestrictionsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: InteractionsRemoveRestrictionsForRepoEndpoint,
    request: InteractionsRemoveRestrictionsForRepoRequestOptions,
    response: OctokitResponse[_]
  ): ParametersInteractionsRemoveRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsRemoveRestrictionsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersInteractionsRemoveRestrictionsForRepoEndpointMutableBuilder[Self <: ParametersInteractionsRemoveRestrictionsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: InteractionsRemoveRestrictionsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: InteractionsRemoveRestrictionsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
