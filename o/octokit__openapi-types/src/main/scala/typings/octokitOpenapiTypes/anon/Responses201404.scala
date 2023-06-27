package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201404 extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonLabels
  
  var responses: `201404`
}
object Responses201404 {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonLabels, responses: `201404`): Responses201404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabels): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
