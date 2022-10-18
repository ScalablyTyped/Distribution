package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonActivecachescount extends StObject {
  
  var parameters: `76`
  
  var responses: `200ContentApplicationjsonActivecachescount`
}
object Responses200ContentApplicationjsonActivecachescount {
  
  inline def apply(parameters: `76`, responses: `200ContentApplicationjsonActivecachescount`): Responses200ContentApplicationjsonActivecachescount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonActivecachescount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonActivecachescount](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonActivecachescount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
