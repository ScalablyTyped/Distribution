package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDownloadArtifactEndpoint
import typings.octokitTypes.endpointsMod.ActionsDownloadArtifactRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsDownloadArtifactEndpoint extends StObject {
  
  var parameters: ActionsDownloadArtifactEndpoint
  
  var request: ActionsDownloadArtifactRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsDownloadArtifactEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDownloadArtifactEndpoint,
    request: ActionsDownloadArtifactRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsDownloadArtifactEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDownloadArtifactEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDownloadArtifactEndpointMutableBuilder[Self <: ParametersActionsDownloadArtifactEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDownloadArtifactEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDownloadArtifactRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
