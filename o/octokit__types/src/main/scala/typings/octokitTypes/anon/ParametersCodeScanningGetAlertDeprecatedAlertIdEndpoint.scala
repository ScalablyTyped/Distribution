package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodeScanningGetAlertDeprecatedAlertIdEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningGetAlertRequestOptions
import typings.octokitTypes.endpointsMod.CodeScanningGetAlertResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodeScanningGetAlertDeprecatedAlertIdEndpoint extends StObject {
  
  var parameters: CodeScanningGetAlertDeprecatedAlertIdEndpoint = js.native
  
  var request: CodeScanningGetAlertRequestOptions = js.native
  
  var response: OctokitResponse[CodeScanningGetAlertResponseData] = js.native
}
object ParametersCodeScanningGetAlertDeprecatedAlertIdEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodeScanningGetAlertDeprecatedAlertIdEndpoint,
    request: CodeScanningGetAlertRequestOptions,
    response: OctokitResponse[CodeScanningGetAlertResponseData]
  ): ParametersCodeScanningGetAlertDeprecatedAlertIdEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningGetAlertDeprecatedAlertIdEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodeScanningGetAlertDeprecatedAlertIdEndpointMutableBuilder[Self <: ParametersCodeScanningGetAlertDeprecatedAlertIdEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CodeScanningGetAlertDeprecatedAlertIdEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodeScanningGetAlertRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningGetAlertResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
