package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.LicensesGetEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetRequestOptions
import typings.octokitTypes.endpointsMod.LicensesGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersLicensesGetEndpoint extends StObject {
  
  var parameters: LicensesGetEndpoint = js.native
  
  var request: LicensesGetRequestOptions = js.native
  
  var response: OctokitResponse[LicensesGetResponseData] = js.native
}
object ParametersLicensesGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: LicensesGetEndpoint,
    request: LicensesGetRequestOptions,
    response: OctokitResponse[LicensesGetResponseData]
  ): ParametersLicensesGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersLicensesGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersLicensesGetEndpointMutableBuilder[Self <: ParametersLicensesGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: LicensesGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: LicensesGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[LicensesGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
