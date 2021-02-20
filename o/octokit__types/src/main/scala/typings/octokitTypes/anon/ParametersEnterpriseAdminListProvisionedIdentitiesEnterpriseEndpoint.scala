package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedIdentitiesEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminListProvisionedIdentitiesEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint,
    request: EnterpriseAdminListProvisionedIdentitiesEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData]
  ): ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminListProvisionedIdentitiesEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminListProvisionedIdentitiesEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
