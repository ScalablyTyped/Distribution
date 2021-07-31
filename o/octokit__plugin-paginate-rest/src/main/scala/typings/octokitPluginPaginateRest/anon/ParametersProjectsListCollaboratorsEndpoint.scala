package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ProjectsListCollaboratorsEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListCollaboratorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsListCollaboratorsEndpoint extends StObject {
  
  var parameters: ProjectsListCollaboratorsEndpoint
  
  var response: OctokitResponse[ProjectsListCollaboratorsResponseData]
}
object ParametersProjectsListCollaboratorsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsListCollaboratorsEndpoint,
    response: OctokitResponse[ProjectsListCollaboratorsResponseData]
  ): ParametersProjectsListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListCollaboratorsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsListCollaboratorsEndpointMutableBuilder[Self <: ParametersProjectsListCollaboratorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsListCollaboratorsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListCollaboratorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
