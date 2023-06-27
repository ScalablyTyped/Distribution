package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content140 extends StObject {
  
  var parameters: PathDiscussionnumber
  
  var requestBody: ContentApplicationjson139
  
  var responses: `200Content140`
}
object Responses200Content140 {
  
  inline def apply(
    parameters: PathDiscussionnumber,
    requestBody: ContentApplicationjson139,
    responses: `200Content140`
  ): Responses200Content140 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content140]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content140] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson139): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content140`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
