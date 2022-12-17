package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonCreatedatId extends StObject {
  
  var parameters: `472`
  
  var responses: `200ContentApplicationjsonCreatedatId`
}
object Responses200ContentApplicationjsonCreatedatId {
  
  inline def apply(parameters: `472`, responses: `200ContentApplicationjsonCreatedatId`): Responses200ContentApplicationjsonCreatedatId = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonCreatedatId]
  }
  
  extension [Self <: Responses200ContentApplicationjsonCreatedatId](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
