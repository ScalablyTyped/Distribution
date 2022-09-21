package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonCustom404 extends StObject {
  
  var parameters: `491`
  
  var responses: `200ContentApplicationjsonCustom404`
}
object Responses200ContentApplicationjsonCustom404 {
  
  inline def apply(parameters: `491`, responses: `200ContentApplicationjsonCustom404`): Responses200ContentApplicationjsonCustom404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonCustom404]
  }
  
  extension [Self <: Responses200ContentApplicationjsonCustom404](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCustom404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
