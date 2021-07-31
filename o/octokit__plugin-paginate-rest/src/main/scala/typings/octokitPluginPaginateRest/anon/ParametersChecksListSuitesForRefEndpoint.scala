package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefEndpoint
import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersChecksListSuitesForRefEndpoint extends StObject {
  
  var parameters: ChecksListSuitesForRefEndpoint
  
  var response: OctokitResponse[ChecksListSuitesForRefResponseData] & `14`
}
object ParametersChecksListSuitesForRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksListSuitesForRefEndpoint,
    response: OctokitResponse[ChecksListSuitesForRefResponseData] & `14`
  ): ParametersChecksListSuitesForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListSuitesForRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksListSuitesForRefEndpointMutableBuilder[Self <: ParametersChecksListSuitesForRefEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksListSuitesForRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListSuitesForRefResponseData] & `14`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
