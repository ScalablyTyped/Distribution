package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonIncludeclaimkeysArray extends StObject {
  
  var parameters: `582`
  
  var responses: `200ContentApplicationjsonIncludeclaimkeysArray`
}
object Responses200ContentApplicationjsonIncludeclaimkeysArray {
  
  inline def apply(parameters: `582`, responses: `200ContentApplicationjsonIncludeclaimkeysArray`): Responses200ContentApplicationjsonIncludeclaimkeysArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonIncludeclaimkeysArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonIncludeclaimkeysArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonIncludeclaimkeysArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
