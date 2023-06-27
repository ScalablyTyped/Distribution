package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters769 extends StObject {
  
  var parameters: `769`
  
  var responses: `200ContentApplicationjsonNames`
}
object Parameters769 {
  
  inline def apply(parameters: `769`, responses: `200ContentApplicationjsonNames`): Parameters769 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters769]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters769] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `769`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNames`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
