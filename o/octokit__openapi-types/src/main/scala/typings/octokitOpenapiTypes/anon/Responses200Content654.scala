package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content654 extends StObject {
  
  var requestBody: ContentApplicationjson381
  
  var responses: `200Content654`
}
object Responses200Content654 {
  
  inline def apply(requestBody: ContentApplicationjson381, responses: `200Content654`): Responses200Content654 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content654]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content654] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjson381): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content654`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
