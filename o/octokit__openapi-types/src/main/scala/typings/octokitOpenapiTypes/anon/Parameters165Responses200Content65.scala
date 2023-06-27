package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters165Responses200Content65 extends StObject {
  
  var parameters: `165`
  
  var responses: `200Content65`
}
object Parameters165Responses200Content65 {
  
  inline def apply(parameters: `165`, responses: `200Content65`): Parameters165Responses200Content65 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters165Responses200Content65]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters165Responses200Content65] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content65`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
