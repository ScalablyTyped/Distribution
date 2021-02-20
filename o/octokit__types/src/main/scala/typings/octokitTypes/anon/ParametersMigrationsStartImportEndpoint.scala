package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsStartImportEndpoint
import typings.octokitTypes.endpointsMod.MigrationsStartImportRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsStartImportResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsStartImportEndpoint extends StObject {
  
  var parameters: MigrationsStartImportEndpoint = js.native
  
  var request: MigrationsStartImportRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsStartImportResponseData] = js.native
}
object ParametersMigrationsStartImportEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsStartImportEndpoint,
    request: MigrationsStartImportRequestOptions,
    response: OctokitResponse[MigrationsStartImportResponseData]
  ): ParametersMigrationsStartImportEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsStartImportEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsStartImportEndpointMutableBuilder[Self <: ParametersMigrationsStartImportEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsStartImportEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsStartImportRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsStartImportResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
