package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingUserEndpoint
import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingUserRequestOptions
import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersBillingGetGithubPackagesBillingUserEndpoint extends StObject {
  
  var parameters: BillingGetGithubPackagesBillingUserEndpoint = js.native
  
  var request: BillingGetGithubPackagesBillingUserRequestOptions = js.native
  
  var response: OctokitResponse[BillingGetGithubPackagesBillingUserResponseData] = js.native
}
object ParametersBillingGetGithubPackagesBillingUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: BillingGetGithubPackagesBillingUserEndpoint,
    request: BillingGetGithubPackagesBillingUserRequestOptions,
    response: OctokitResponse[BillingGetGithubPackagesBillingUserResponseData]
  ): ParametersBillingGetGithubPackagesBillingUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetGithubPackagesBillingUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersBillingGetGithubPackagesBillingUserEndpointMutableBuilder[Self <: ParametersBillingGetGithubPackagesBillingUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: BillingGetGithubPackagesBillingUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: BillingGetGithubPackagesBillingUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetGithubPackagesBillingUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
