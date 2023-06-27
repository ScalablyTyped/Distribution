package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters639Responses200ContentApplicationjsonKeyKeyid extends StObject {
  
  var parameters: `639`
  
  var responses: `200ContentApplicationjsonKeyKeyid`
}
object Parameters639Responses200ContentApplicationjsonKeyKeyid {
  
  inline def apply(parameters: `639`, responses: `200ContentApplicationjsonKeyKeyid`): Parameters639Responses200ContentApplicationjsonKeyKeyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters639Responses200ContentApplicationjsonKeyKeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters639Responses200ContentApplicationjsonKeyKeyid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonKeyKeyid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
