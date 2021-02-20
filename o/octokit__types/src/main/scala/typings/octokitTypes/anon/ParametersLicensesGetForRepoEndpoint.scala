package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.LicensesGetForRepoEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetForRepoRequestOptions
import typings.octokitTypes.endpointsMod.LicensesGetForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersLicensesGetForRepoEndpoint extends StObject {
  
  var parameters: LicensesGetForRepoEndpoint = js.native
  
  var request: LicensesGetForRepoRequestOptions = js.native
  
  var response: OctokitResponse[LicensesGetForRepoResponseData] = js.native
}
object ParametersLicensesGetForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: LicensesGetForRepoEndpoint,
    request: LicensesGetForRepoRequestOptions,
    response: OctokitResponse[LicensesGetForRepoResponseData]
  ): ParametersLicensesGetForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersLicensesGetForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersLicensesGetForRepoEndpointMutableBuilder[Self <: ParametersLicensesGetForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: LicensesGetForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: LicensesGetForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[LicensesGetForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
