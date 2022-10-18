package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content467HeadersLocation extends StObject {
  
  var parameters: PathCommitshaOwnerRepo
  
  var requestBody: ContentApplicationjsonBodyLine
  
  var responses: `201Content467HeadersLocation`
}
object Responses201Content467HeadersLocation {
  
  inline def apply(
    parameters: PathCommitshaOwnerRepo,
    requestBody: ContentApplicationjsonBodyLine,
    responses: `201Content467HeadersLocation`
  ): Responses201Content467HeadersLocation = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content467HeadersLocation]
  }
  
  extension [Self <: Responses201Content467HeadersLocation](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyLine): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content467HeadersLocation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
