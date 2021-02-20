package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodesOfConductGetForRepoEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetForRepoRequestOptions
import typings.octokitTypes.endpointsMod.CodesOfConductGetForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodesOfConductGetForRepoEndpoint extends StObject {
  
  var parameters: CodesOfConductGetForRepoEndpoint = js.native
  
  var request: CodesOfConductGetForRepoRequestOptions = js.native
  
  var response: OctokitResponse[CodesOfConductGetForRepoResponseData] = js.native
}
object ParametersCodesOfConductGetForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodesOfConductGetForRepoEndpoint,
    request: CodesOfConductGetForRepoRequestOptions,
    response: OctokitResponse[CodesOfConductGetForRepoResponseData]
  ): ParametersCodesOfConductGetForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodesOfConductGetForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodesOfConductGetForRepoEndpointMutableBuilder[Self <: ParametersCodesOfConductGetForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CodesOfConductGetForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodesOfConductGetForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodesOfConductGetForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
