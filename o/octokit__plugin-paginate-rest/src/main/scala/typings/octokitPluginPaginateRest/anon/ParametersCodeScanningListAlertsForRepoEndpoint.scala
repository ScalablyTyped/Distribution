package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.CodeScanningListAlertsForRepoEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningListAlertsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodeScanningListAlertsForRepoEndpoint extends StObject {
  
  var parameters: CodeScanningListAlertsForRepoEndpoint = js.native
  
  var response: OctokitResponse[CodeScanningListAlertsForRepoResponseData] = js.native
}
object ParametersCodeScanningListAlertsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodeScanningListAlertsForRepoEndpoint,
    response: OctokitResponse[CodeScanningListAlertsForRepoResponseData]
  ): ParametersCodeScanningListAlertsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningListAlertsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodeScanningListAlertsForRepoEndpointMutableBuilder[Self <: ParametersCodeScanningListAlertsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CodeScanningListAlertsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningListAlertsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
