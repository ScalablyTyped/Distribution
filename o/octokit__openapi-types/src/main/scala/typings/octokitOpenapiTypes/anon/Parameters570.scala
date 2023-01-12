package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters570 extends StObject {
  
  var parameters: `570`
  
  var responses: `200ContentApplicationjsonCreatedatId`
}
object Parameters570 {
  
  inline def apply(parameters: `570`, responses: `200ContentApplicationjsonCreatedatId`): Parameters570 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters570]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters570] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `570`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
