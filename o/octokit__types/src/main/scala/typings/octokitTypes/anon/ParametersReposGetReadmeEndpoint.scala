package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetReadmeEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReadmeRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetReadmeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetReadmeEndpoint extends StObject {
  
  var parameters: ReposGetReadmeEndpoint
  
  var request: ReposGetReadmeRequestOptions
  
  var response: OctokitResponse[ReposGetReadmeResponseData]
}
object ParametersReposGetReadmeEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetReadmeEndpoint,
    request: ReposGetReadmeRequestOptions,
    response: OctokitResponse[ReposGetReadmeResponseData]
  ): ParametersReposGetReadmeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReadmeEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetReadmeEndpointMutableBuilder[Self <: ParametersReposGetReadmeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetReadmeEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetReadmeRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetReadmeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
