package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingOrgEndpoint
import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingOrgRequestOptions
import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersBillingGetGithubPackagesBillingOrgEndpoint extends StObject {
  
  var parameters: BillingGetGithubPackagesBillingOrgEndpoint
  
  var request: BillingGetGithubPackagesBillingOrgRequestOptions
  
  var response: OctokitResponse[BillingGetGithubPackagesBillingOrgResponseData]
}
object ParametersBillingGetGithubPackagesBillingOrgEndpoint {
  
  inline def apply(
    parameters: BillingGetGithubPackagesBillingOrgEndpoint,
    request: BillingGetGithubPackagesBillingOrgRequestOptions,
    response: OctokitResponse[BillingGetGithubPackagesBillingOrgResponseData]
  ): ParametersBillingGetGithubPackagesBillingOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetGithubPackagesBillingOrgEndpoint]
  }
  
  extension [Self <: ParametersBillingGetGithubPackagesBillingOrgEndpoint](x: Self) {
    
    inline def setParameters(value: BillingGetGithubPackagesBillingOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: BillingGetGithubPackagesBillingOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[BillingGetGithubPackagesBillingOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
