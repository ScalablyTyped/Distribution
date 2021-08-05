package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListWatchersForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActivityListWatchersForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListWatchersForRepoEndpoint extends StObject {
  
  var parameters: ActivityListWatchersForRepoEndpoint
  
  var response: OctokitResponse[ActivityListWatchersForRepoResponseData]
}
object ParametersActivityListWatchersForRepoEndpoint {
  
  inline def apply(
    parameters: ActivityListWatchersForRepoEndpoint,
    response: OctokitResponse[ActivityListWatchersForRepoResponseData]
  ): ParametersActivityListWatchersForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListWatchersForRepoEndpoint]
  }
  
  extension [Self <: ParametersActivityListWatchersForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityListWatchersForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActivityListWatchersForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
