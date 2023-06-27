package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonRecord extends StObject {
  
  var parameters: `645`
  
  var responses: `201ContentApplicationjsonRecord`
}
object Responses201ContentApplicationjsonRecord {
  
  inline def apply(parameters: `645`, responses: `201ContentApplicationjsonRecord`): Responses201ContentApplicationjsonRecord = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonRecord] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `645`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonRecord`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
