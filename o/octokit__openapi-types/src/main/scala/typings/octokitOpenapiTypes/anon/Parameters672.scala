package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters672 extends StObject {
  
  var parameters: `672`
  
  var responses: `200ContentApplicationjsonErrorsArray`
}
object Parameters672 {
  
  inline def apply(parameters: `672`, responses: `200ContentApplicationjsonErrorsArray`): Parameters672 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters672]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters672] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `672`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonErrorsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
