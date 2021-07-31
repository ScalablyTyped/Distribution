package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsStartForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsStartForOrgRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsStartForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsStartForOrgEndpoint extends StObject {
  
  var parameters: MigrationsStartForOrgEndpoint
  
  var request: MigrationsStartForOrgRequestOptions
  
  var response: OctokitResponse[MigrationsStartForOrgResponseData]
}
object ParametersMigrationsStartForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsStartForOrgEndpoint,
    request: MigrationsStartForOrgRequestOptions,
    response: OctokitResponse[MigrationsStartForOrgResponseData]
  ): ParametersMigrationsStartForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsStartForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsStartForOrgEndpointMutableBuilder[Self <: ParametersMigrationsStartForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsStartForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsStartForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsStartForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
