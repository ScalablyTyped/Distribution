package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters433 extends StObject {
  
  var parameters: `433`
  
  var responses: `200ContentApplicationjsonCreatedatId`
}
object Parameters433 {
  
  inline def apply(parameters: `433`, responses: `200ContentApplicationjsonCreatedatId`): Parameters433 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters433]
  }
  
  extension [Self <: Parameters433](x: Self) {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
