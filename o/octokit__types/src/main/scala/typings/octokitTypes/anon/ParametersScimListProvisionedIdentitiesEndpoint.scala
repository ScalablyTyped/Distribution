package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesEndpoint
import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesRequestOptions
import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersScimListProvisionedIdentitiesEndpoint extends StObject {
  
  var parameters: ScimListProvisionedIdentitiesEndpoint = js.native
  
  var request: ScimListProvisionedIdentitiesRequestOptions = js.native
  
  var response: OctokitResponse[ScimListProvisionedIdentitiesResponseData] = js.native
}
object ParametersScimListProvisionedIdentitiesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimListProvisionedIdentitiesEndpoint,
    request: ScimListProvisionedIdentitiesRequestOptions,
    response: OctokitResponse[ScimListProvisionedIdentitiesResponseData]
  ): ParametersScimListProvisionedIdentitiesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimListProvisionedIdentitiesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimListProvisionedIdentitiesEndpointMutableBuilder[Self <: ParametersScimListProvisionedIdentitiesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ScimListProvisionedIdentitiesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ScimListProvisionedIdentitiesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ScimListProvisionedIdentitiesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
