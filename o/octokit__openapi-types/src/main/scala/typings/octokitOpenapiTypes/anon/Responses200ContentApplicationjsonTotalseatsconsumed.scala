package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonTotalseatsconsumed extends StObject {
  
  var parameters: Query426
  
  var responses: `200ContentApplicationjsonTotalseatsconsumed`
}
object Responses200ContentApplicationjsonTotalseatsconsumed {
  
  inline def apply(parameters: Query426, responses: `200ContentApplicationjsonTotalseatsconsumed`): Responses200ContentApplicationjsonTotalseatsconsumed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonTotalseatsconsumed]
  }
  
  extension [Self <: Responses200ContentApplicationjsonTotalseatsconsumed](x: Self) {
    
    inline def setParameters(value: Query426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalseatsconsumed`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
