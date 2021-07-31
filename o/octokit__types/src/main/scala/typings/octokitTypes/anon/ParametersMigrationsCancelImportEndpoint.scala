package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsCancelImportEndpoint
import typings.octokitTypes.endpointsMod.MigrationsCancelImportRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsCancelImportEndpoint extends StObject {
  
  var parameters: MigrationsCancelImportEndpoint
  
  var request: MigrationsCancelImportRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersMigrationsCancelImportEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsCancelImportEndpoint,
    request: MigrationsCancelImportRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersMigrationsCancelImportEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsCancelImportEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsCancelImportEndpointMutableBuilder[Self <: ParametersMigrationsCancelImportEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsCancelImportEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsCancelImportRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
