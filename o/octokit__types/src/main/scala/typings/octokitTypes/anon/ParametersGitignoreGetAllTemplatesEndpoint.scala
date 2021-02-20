package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesEndpoint
import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesRequestOptions
import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitignoreGetAllTemplatesEndpoint extends StObject {
  
  var parameters: GitignoreGetAllTemplatesEndpoint = js.native
  
  var request: GitignoreGetAllTemplatesRequestOptions = js.native
  
  var response: OctokitResponse[GitignoreGetAllTemplatesResponseData] = js.native
}
object ParametersGitignoreGetAllTemplatesEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitignoreGetAllTemplatesEndpoint,
    request: GitignoreGetAllTemplatesRequestOptions,
    response: OctokitResponse[GitignoreGetAllTemplatesResponseData]
  ): ParametersGitignoreGetAllTemplatesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitignoreGetAllTemplatesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitignoreGetAllTemplatesEndpointMutableBuilder[Self <: ParametersGitignoreGetAllTemplatesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GitignoreGetAllTemplatesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitignoreGetAllTemplatesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitignoreGetAllTemplatesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
