package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesEndpoint
import typings.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesRequestOptions
import typings.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersChecksSetSuitesPreferencesEndpoint extends StObject {
  
  var parameters: ChecksSetSuitesPreferencesEndpoint
  
  var request: ChecksSetSuitesPreferencesRequestOptions
  
  var response: OctokitResponse[ChecksSetSuitesPreferencesResponseData]
}
object ParametersChecksSetSuitesPreferencesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksSetSuitesPreferencesEndpoint,
    request: ChecksSetSuitesPreferencesRequestOptions,
    response: OctokitResponse[ChecksSetSuitesPreferencesResponseData]
  ): ParametersChecksSetSuitesPreferencesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksSetSuitesPreferencesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksSetSuitesPreferencesEndpointMutableBuilder[Self <: ParametersChecksSetSuitesPreferencesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksSetSuitesPreferencesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksSetSuitesPreferencesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksSetSuitesPreferencesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
