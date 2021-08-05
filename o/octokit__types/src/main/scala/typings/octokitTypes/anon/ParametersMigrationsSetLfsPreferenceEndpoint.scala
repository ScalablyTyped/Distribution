package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceEndpoint
import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsSetLfsPreferenceEndpoint extends StObject {
  
  var parameters: MigrationsSetLfsPreferenceEndpoint
  
  var request: MigrationsSetLfsPreferenceRequestOptions
  
  var response: OctokitResponse[MigrationsSetLfsPreferenceResponseData]
}
object ParametersMigrationsSetLfsPreferenceEndpoint {
  
  inline def apply(
    parameters: MigrationsSetLfsPreferenceEndpoint,
    request: MigrationsSetLfsPreferenceRequestOptions,
    response: OctokitResponse[MigrationsSetLfsPreferenceResponseData]
  ): ParametersMigrationsSetLfsPreferenceEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsSetLfsPreferenceEndpoint]
  }
  
  extension [Self <: ParametersMigrationsSetLfsPreferenceEndpoint](x: Self) {
    
    inline def setParameters(value: MigrationsSetLfsPreferenceEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: MigrationsSetLfsPreferenceRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MigrationsSetLfsPreferenceResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
