package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsGetCommitAuthorsEndpoint extends StObject {
  
  var parameters: MigrationsGetCommitAuthorsEndpoint
  
  var request: MigrationsGetCommitAuthorsRequestOptions
  
  var response: OctokitResponse[MigrationsGetCommitAuthorsResponseData]
}
object ParametersMigrationsGetCommitAuthorsEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsGetCommitAuthorsEndpoint,
    request: MigrationsGetCommitAuthorsRequestOptions,
    response: OctokitResponse[MigrationsGetCommitAuthorsResponseData]
  ): ParametersMigrationsGetCommitAuthorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetCommitAuthorsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsGetCommitAuthorsEndpointMutableBuilder[Self <: ParametersMigrationsGetCommitAuthorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsGetCommitAuthorsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsGetCommitAuthorsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetCommitAuthorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
