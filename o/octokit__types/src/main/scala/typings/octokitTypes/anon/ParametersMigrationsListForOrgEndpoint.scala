package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsListForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListForOrgRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsListForOrgEndpoint extends StObject {
  
  var parameters: MigrationsListForOrgEndpoint
  
  var request: MigrationsListForOrgRequestOptions
  
  var response: OctokitResponse[MigrationsListForOrgResponseData]
}
object ParametersMigrationsListForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsListForOrgEndpoint,
    request: MigrationsListForOrgRequestOptions,
    response: OctokitResponse[MigrationsListForOrgResponseData]
  ): ParametersMigrationsListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsListForOrgEndpointMutableBuilder[Self <: ParametersMigrationsListForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsListForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsListForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
