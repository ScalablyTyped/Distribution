package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentTexthtml304Unknown extends StObject {
  
  var requestBody: ContentApplicationjsonContext
  
  var responses: `200ContentTexthtml304Unknown`
}
object Responses200ContentTexthtml304Unknown {
  
  inline def apply(requestBody: ContentApplicationjsonContext, responses: `200ContentTexthtml304Unknown`): Responses200ContentTexthtml304Unknown = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentTexthtml304Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentTexthtml304Unknown] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonContext): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentTexthtml304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
