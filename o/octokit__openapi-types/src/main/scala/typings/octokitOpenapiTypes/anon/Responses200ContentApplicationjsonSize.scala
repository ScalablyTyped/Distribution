package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonSize extends StObject {
  
  var parameters: Query107
  
  var responses: `200ContentApplicationjsonSize`
}
object Responses200ContentApplicationjsonSize {
  
  inline def apply(parameters: Query107, responses: `200ContentApplicationjsonSize`): Responses200ContentApplicationjsonSize = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonSize]
  }
  
  extension [Self <: Responses200ContentApplicationjsonSize](x: Self) {
    
    inline def setParameters(value: Query107): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSize`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
