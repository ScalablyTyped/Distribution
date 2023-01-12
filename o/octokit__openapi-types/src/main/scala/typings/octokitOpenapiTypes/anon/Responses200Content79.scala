package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content79 extends StObject {
  
  var requestBody: Content80
  
  var responses: `200Content79`
}
object Responses200Content79 {
  
  inline def apply(requestBody: Content80, responses: `200Content79`): Responses200Content79 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content79]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content79] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: Content80): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content79`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
