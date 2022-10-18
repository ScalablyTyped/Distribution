package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonSelectedactionsurl extends StObject {
  
  var parameters: `37`
  
  var responses: `200ContentApplicationjsonSelectedactionsurl`
}
object Responses200ContentApplicationjsonSelectedactionsurl {
  
  inline def apply(parameters: `37`, responses: `200ContentApplicationjsonSelectedactionsurl`): Responses200ContentApplicationjsonSelectedactionsurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonSelectedactionsurl]
  }
  
  extension [Self <: Responses200ContentApplicationjsonSelectedactionsurl](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSelectedactionsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
