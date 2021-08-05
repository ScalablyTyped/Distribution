package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCheckIfMergedEndpoint
import typings.octokitTypes.endpointsMod.PullsCheckIfMergedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsCheckIfMergedEndpoint extends StObject {
  
  var parameters: PullsCheckIfMergedEndpoint
  
  var request: PullsCheckIfMergedRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersPullsCheckIfMergedEndpoint {
  
  inline def apply(
    parameters: PullsCheckIfMergedEndpoint,
    request: PullsCheckIfMergedRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersPullsCheckIfMergedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCheckIfMergedEndpoint]
  }
  
  extension [Self <: ParametersPullsCheckIfMergedEndpoint](x: Self) {
    
    inline def setParameters(value: PullsCheckIfMergedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsCheckIfMergedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
