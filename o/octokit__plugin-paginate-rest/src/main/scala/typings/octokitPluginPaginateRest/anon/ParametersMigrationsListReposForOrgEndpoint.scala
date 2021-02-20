package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.MigrationsListReposForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListReposForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsListReposForOrgEndpoint extends StObject {
  
  var parameters: MigrationsListReposForOrgEndpoint = js.native
  
  var response: OctokitResponse[MigrationsListReposForOrgResponseData] = js.native
}
object ParametersMigrationsListReposForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsListReposForOrgEndpoint,
    response: OctokitResponse[MigrationsListReposForOrgResponseData]
  ): ParametersMigrationsListReposForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListReposForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsListReposForOrgEndpointMutableBuilder[Self <: ParametersMigrationsListReposForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsListReposForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListReposForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
