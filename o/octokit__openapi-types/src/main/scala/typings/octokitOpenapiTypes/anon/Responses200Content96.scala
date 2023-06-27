package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content96 extends StObject {
  
  var requestBody: Content95
  
  var responses: `200Content96`
}
object Responses200Content96 {
  
  inline def apply(requestBody: Content95, responses: `200Content96`): Responses200Content96 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content96]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content96] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: Content95): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content96`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
