package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201665 extends StObject {
  
  var requestBody: ContentApplicationjsonAccounturls
  
  var responses: `201665`
}
object Responses201665 {
  
  inline def apply(requestBody: ContentApplicationjsonAccounturls, responses: `201665`): Responses201665 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201665]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201665] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonAccounturls): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201665`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
