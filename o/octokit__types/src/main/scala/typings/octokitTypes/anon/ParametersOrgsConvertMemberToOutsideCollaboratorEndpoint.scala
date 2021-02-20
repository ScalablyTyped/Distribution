package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsConvertMemberToOutsideCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.OrgsConvertMemberToOutsideCollaboratorRequestOptions
import typings.octokitTypes.endpointsMod.OrgsConvertMemberToOutsideCollaboratorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsConvertMemberToOutsideCollaboratorEndpoint extends StObject {
  
  var parameters: OrgsConvertMemberToOutsideCollaboratorEndpoint = js.native
  
  var request: OrgsConvertMemberToOutsideCollaboratorRequestOptions = js.native
  
  var response: OctokitResponse[OrgsConvertMemberToOutsideCollaboratorResponseData] = js.native
}
object ParametersOrgsConvertMemberToOutsideCollaboratorEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsConvertMemberToOutsideCollaboratorEndpoint,
    request: OrgsConvertMemberToOutsideCollaboratorRequestOptions,
    response: OctokitResponse[OrgsConvertMemberToOutsideCollaboratorResponseData]
  ): ParametersOrgsConvertMemberToOutsideCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsConvertMemberToOutsideCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsConvertMemberToOutsideCollaboratorEndpointMutableBuilder[Self <: ParametersOrgsConvertMemberToOutsideCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsConvertMemberToOutsideCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsConvertMemberToOutsideCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsConvertMemberToOutsideCollaboratorResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
