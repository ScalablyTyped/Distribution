package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.LicensesGetForRepoEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetForRepoRequestOptions
import typings.octokitTypes.endpointsMod.LicensesGetForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersLicensesGetForRepoEndpoint extends StObject {
  
  var parameters: LicensesGetForRepoEndpoint
  
  var request: LicensesGetForRepoRequestOptions
  
  var response: OctokitResponse[LicensesGetForRepoResponseData]
}
object ParametersLicensesGetForRepoEndpoint {
  
  inline def apply(
    parameters: LicensesGetForRepoEndpoint,
    request: LicensesGetForRepoRequestOptions,
    response: OctokitResponse[LicensesGetForRepoResponseData]
  ): ParametersLicensesGetForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersLicensesGetForRepoEndpoint]
  }
  
  extension [Self <: ParametersLicensesGetForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: LicensesGetForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: LicensesGetForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[LicensesGetForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
