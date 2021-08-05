package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsUpdateImportEndpoint
import typings.octokitTypes.endpointsMod.MigrationsUpdateImportRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsUpdateImportResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsUpdateImportEndpoint extends StObject {
  
  var parameters: MigrationsUpdateImportEndpoint
  
  var request: MigrationsUpdateImportRequestOptions
  
  var response: OctokitResponse[MigrationsUpdateImportResponseData]
}
object ParametersMigrationsUpdateImportEndpoint {
  
  inline def apply(
    parameters: MigrationsUpdateImportEndpoint,
    request: MigrationsUpdateImportRequestOptions,
    response: OctokitResponse[MigrationsUpdateImportResponseData]
  ): ParametersMigrationsUpdateImportEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsUpdateImportEndpoint]
  }
  
  extension [Self <: ParametersMigrationsUpdateImportEndpoint](x: Self) {
    
    inline def setParameters(value: MigrationsUpdateImportEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: MigrationsUpdateImportRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MigrationsUpdateImportResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
