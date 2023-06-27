package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters639Responses200ContentApplicationjsonCreatedatId extends StObject {
  
  var parameters: `639`
  
  var responses: `200ContentApplicationjsonCreatedatId`
}
object Parameters639Responses200ContentApplicationjsonCreatedatId {
  
  inline def apply(parameters: `639`, responses: `200ContentApplicationjsonCreatedatId`): Parameters639Responses200ContentApplicationjsonCreatedatId = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters639Responses200ContentApplicationjsonCreatedatId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters639Responses200ContentApplicationjsonCreatedatId] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
