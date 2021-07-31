package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.CodeScanningListRecentAnalysesEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningListRecentAnalysesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersCodeScanningListRecentAnalysesEndpoint extends StObject {
  
  var parameters: CodeScanningListRecentAnalysesEndpoint
  
  var response: OctokitResponse[CodeScanningListRecentAnalysesResponseData]
}
object ParametersCodeScanningListRecentAnalysesEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodeScanningListRecentAnalysesEndpoint,
    response: OctokitResponse[CodeScanningListRecentAnalysesResponseData]
  ): ParametersCodeScanningListRecentAnalysesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningListRecentAnalysesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodeScanningListRecentAnalysesEndpointMutableBuilder[Self <: ParametersCodeScanningListRecentAnalysesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CodeScanningListRecentAnalysesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningListRecentAnalysesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
