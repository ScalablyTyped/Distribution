package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonCname extends StObject {
  
  var parameters: `76`
  
  var responses: `200ContentApplicationjsonCname`
}
object Responses200ContentApplicationjsonCname {
  
  inline def apply(parameters: `76`, responses: `200ContentApplicationjsonCname`): Responses200ContentApplicationjsonCname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonCname]
  }
  
  extension [Self <: Responses200ContentApplicationjsonCname](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCname`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
