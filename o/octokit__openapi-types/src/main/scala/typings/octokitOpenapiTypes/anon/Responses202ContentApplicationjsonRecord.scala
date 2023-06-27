package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202ContentApplicationjsonRecord extends StObject {
  
  var parameters: `582`
  
  var responses: `202ContentApplicationjsonRecord`
}
object Responses202ContentApplicationjsonRecord {
  
  inline def apply(parameters: `582`, responses: `202ContentApplicationjsonRecord`): Responses202ContentApplicationjsonRecord = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202ContentApplicationjsonRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202ContentApplicationjsonRecord] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202ContentApplicationjsonRecord`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
