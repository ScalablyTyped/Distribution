package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDownloadArchiveEndpoint
import typings.octokitTypes.endpointsMod.ReposDownloadArchiveRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDownloadArchiveEndpoint extends StObject {
  
  var parameters: ReposDownloadArchiveEndpoint
  
  var request: ReposDownloadArchiveRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDownloadArchiveEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDownloadArchiveEndpoint,
    request: ReposDownloadArchiveRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDownloadArchiveEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDownloadArchiveEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDownloadArchiveEndpointMutableBuilder[Self <: ParametersReposDownloadArchiveEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDownloadArchiveEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDownloadArchiveRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
