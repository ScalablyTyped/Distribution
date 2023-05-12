package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters642 extends StObject {
  
  var parameters: `642`
  
  var responses: `200ContentApplicationjsonCreatedatId`
}
object Parameters642 {
  
  inline def apply(parameters: `642`, responses: `200ContentApplicationjsonCreatedatId`): Parameters642 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters642]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters642] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `642`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
