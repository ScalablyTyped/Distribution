package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content407 extends StObject {
  
  var requestBody: ContentApplicationjsonKeyTitle
  
  var responses: `201Content407`
}
object Responses201Content407 {
  
  inline def apply(requestBody: ContentApplicationjsonKeyTitle, responses: `201Content407`): Responses201Content407 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201Content407] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonKeyTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content407`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
