package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content140 extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumber
  
  var requestBody: ContentApplicationjson139
  
  var responses: `201Content140`
}
object Responses201Content140 {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumber,
    requestBody: ContentApplicationjson139,
    responses: `201Content140`
  ): Responses201Content140 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content140]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201Content140] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson139): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content140`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
