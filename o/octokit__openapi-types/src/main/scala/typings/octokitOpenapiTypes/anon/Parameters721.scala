package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters721 extends StObject {
  
  var parameters: `721`
  
  var responses: `200Content628404Content41410Content41`
}
object Parameters721 {
  
  inline def apply(parameters: `721`, responses: `200Content628404Content41410Content41`): Parameters721 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters721]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters721] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `721`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content628404Content41410Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
