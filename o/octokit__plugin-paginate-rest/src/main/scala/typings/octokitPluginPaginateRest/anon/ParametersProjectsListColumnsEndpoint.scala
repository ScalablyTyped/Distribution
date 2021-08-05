package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ProjectsListColumnsEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListColumnsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsListColumnsEndpoint extends StObject {
  
  var parameters: ProjectsListColumnsEndpoint
  
  var response: OctokitResponse[ProjectsListColumnsResponseData]
}
object ParametersProjectsListColumnsEndpoint {
  
  inline def apply(
    parameters: ProjectsListColumnsEndpoint,
    response: OctokitResponse[ProjectsListColumnsResponseData]
  ): ParametersProjectsListColumnsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListColumnsEndpoint]
  }
  
  extension [Self <: ParametersProjectsListColumnsEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsListColumnsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsListColumnsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
