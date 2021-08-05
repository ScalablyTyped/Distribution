package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListFilesEndpoint
import typings.octokitTypes.endpointsMod.PullsListFilesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsListFilesEndpoint extends StObject {
  
  var parameters: PullsListFilesEndpoint
  
  var response: OctokitResponse[PullsListFilesResponseData]
}
object ParametersPullsListFilesEndpoint {
  
  inline def apply(parameters: PullsListFilesEndpoint, response: OctokitResponse[PullsListFilesResponseData]): ParametersPullsListFilesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListFilesEndpoint]
  }
  
  extension [Self <: ParametersPullsListFilesEndpoint](x: Self) {
    
    inline def setParameters(value: PullsListFilesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsListFilesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
