package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListFilesEndpoint
import typings.octokitTypes.endpointsMod.PullsListFilesRequestOptions
import typings.octokitTypes.endpointsMod.PullsListFilesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsListFilesEndpoint extends StObject {
  
  var parameters: PullsListFilesEndpoint
  
  var request: PullsListFilesRequestOptions
  
  var response: OctokitResponse[PullsListFilesResponseData]
}
object ParametersPullsListFilesEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListFilesEndpoint,
    request: PullsListFilesRequestOptions,
    response: OctokitResponse[PullsListFilesResponseData]
  ): ParametersPullsListFilesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListFilesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListFilesEndpointMutableBuilder[Self <: ParametersPullsListFilesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListFilesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsListFilesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListFilesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
