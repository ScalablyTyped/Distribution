package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCheckIfMergedEndpoint
import typings.octokitTypes.endpointsMod.PullsCheckIfMergedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsCheckIfMergedEndpoint extends StObject {
  
  var parameters: PullsCheckIfMergedEndpoint = js.native
  
  var request: PullsCheckIfMergedRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersPullsCheckIfMergedEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsCheckIfMergedEndpoint,
    request: PullsCheckIfMergedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersPullsCheckIfMergedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCheckIfMergedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsCheckIfMergedEndpointMutableBuilder[Self <: ParametersPullsCheckIfMergedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsCheckIfMergedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsCheckIfMergedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
