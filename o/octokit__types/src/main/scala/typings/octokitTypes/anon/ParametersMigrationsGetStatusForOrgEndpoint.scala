package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetStatusForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForOrgRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsGetStatusForOrgEndpoint extends StObject {
  
  var parameters: MigrationsGetStatusForOrgEndpoint
  
  var request: MigrationsGetStatusForOrgRequestOptions
  
  var response: OctokitResponse[MigrationsGetStatusForOrgResponseData]
}
object ParametersMigrationsGetStatusForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsGetStatusForOrgEndpoint,
    request: MigrationsGetStatusForOrgRequestOptions,
    response: OctokitResponse[MigrationsGetStatusForOrgResponseData]
  ): ParametersMigrationsGetStatusForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetStatusForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsGetStatusForOrgEndpointMutableBuilder[Self <: ParametersMigrationsGetStatusForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsGetStatusForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsGetStatusForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetStatusForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
