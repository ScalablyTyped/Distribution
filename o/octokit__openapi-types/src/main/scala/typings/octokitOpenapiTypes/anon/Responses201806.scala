package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201806 extends StObject {
  
  var requestBody: ContentApplicationjsonAccounturls
  
  var responses: `201806`
}
object Responses201806 {
  
  inline def apply(requestBody: ContentApplicationjsonAccounturls, responses: `201806`): Responses201806 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201806]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201806] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonAccounturls): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201806`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
