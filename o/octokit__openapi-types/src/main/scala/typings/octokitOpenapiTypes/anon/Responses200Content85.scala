package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content85 extends StObject {
  
  var requestBody: Content84
  
  var responses: `200Content85`
}
object Responses200Content85 {
  
  inline def apply(requestBody: Content84, responses: `200Content85`): Responses200Content85 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content85]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content85] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: Content84): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content85`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
