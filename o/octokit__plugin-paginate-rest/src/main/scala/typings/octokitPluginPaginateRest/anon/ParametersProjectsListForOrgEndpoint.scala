package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ProjectsListForOrgEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsListForOrgEndpoint extends StObject {
  
  var parameters: ProjectsListForOrgEndpoint
  
  var response: OctokitResponse[ProjectsListForOrgResponseData]
}
object ParametersProjectsListForOrgEndpoint {
  
  inline def apply(parameters: ProjectsListForOrgEndpoint, response: OctokitResponse[ProjectsListForOrgResponseData]): ParametersProjectsListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListForOrgEndpoint]
  }
  
  extension [Self <: ParametersProjectsListForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsListForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsListForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
