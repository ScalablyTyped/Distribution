package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201401403404 extends StObject {
  
  var parameters: `582`
  
  var requestBody: ContentApplicationjsonBodyName
  
  var responses: `201401403404`
}
object Responses201401403404 {
  
  inline def apply(parameters: `582`, requestBody: ContentApplicationjsonBodyName, responses: `201401403404`): Responses201401403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201401403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201401403404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
