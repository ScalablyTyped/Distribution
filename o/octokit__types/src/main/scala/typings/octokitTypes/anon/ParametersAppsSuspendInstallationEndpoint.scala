package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsSuspendInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsSuspendInstallationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersAppsSuspendInstallationEndpoint extends StObject {
  
  var parameters: AppsSuspendInstallationEndpoint
  
  var request: AppsSuspendInstallationRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersAppsSuspendInstallationEndpoint {
  
  inline def apply(
    parameters: AppsSuspendInstallationEndpoint,
    request: AppsSuspendInstallationRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersAppsSuspendInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsSuspendInstallationEndpoint]
  }
  
  extension [Self <: ParametersAppsSuspendInstallationEndpoint](x: Self) {
    
    inline def setParameters(value: AppsSuspendInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: AppsSuspendInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
