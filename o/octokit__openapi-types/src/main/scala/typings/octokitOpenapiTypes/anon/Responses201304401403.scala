package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201304401403 extends StObject {
  
  var parameters: Path134
  
  var requestBody: ContentApplicationjsonName
  
  var responses: `201304401403`
}
object Responses201304401403 {
  
  inline def apply(parameters: Path134, requestBody: ContentApplicationjsonName, responses: `201304401403`): Responses201304401403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201304401403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201304401403] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path134): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
