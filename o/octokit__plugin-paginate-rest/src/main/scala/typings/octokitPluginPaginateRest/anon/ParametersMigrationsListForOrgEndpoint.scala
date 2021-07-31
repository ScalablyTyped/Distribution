package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.MigrationsListForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsListForOrgEndpoint extends StObject {
  
  var parameters: MigrationsListForOrgEndpoint
  
  var response: OctokitResponse[MigrationsListForOrgResponseData]
}
object ParametersMigrationsListForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsListForOrgEndpoint,
    response: OctokitResponse[MigrationsListForOrgResponseData]
  ): ParametersMigrationsListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsListForOrgEndpointMutableBuilder[Self <: ParametersMigrationsListForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsListForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
