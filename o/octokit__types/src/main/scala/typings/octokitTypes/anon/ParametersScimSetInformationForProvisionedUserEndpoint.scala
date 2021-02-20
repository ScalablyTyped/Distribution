package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimSetInformationForProvisionedUserEndpoint
import typings.octokitTypes.endpointsMod.ScimSetInformationForProvisionedUserRequestOptions
import typings.octokitTypes.endpointsMod.ScimSetInformationForProvisionedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersScimSetInformationForProvisionedUserEndpoint extends StObject {
  
  var parameters: ScimSetInformationForProvisionedUserEndpoint = js.native
  
  var request: ScimSetInformationForProvisionedUserRequestOptions = js.native
  
  var response: OctokitResponse[ScimSetInformationForProvisionedUserResponseData] = js.native
}
object ParametersScimSetInformationForProvisionedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimSetInformationForProvisionedUserEndpoint,
    request: ScimSetInformationForProvisionedUserRequestOptions,
    response: OctokitResponse[ScimSetInformationForProvisionedUserResponseData]
  ): ParametersScimSetInformationForProvisionedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimSetInformationForProvisionedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimSetInformationForProvisionedUserEndpointMutableBuilder[Self <: ParametersScimSetInformationForProvisionedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ScimSetInformationForProvisionedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ScimSetInformationForProvisionedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ScimSetInformationForProvisionedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
