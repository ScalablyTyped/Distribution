package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters107 extends StObject {
  
  var parameters: `107`
  
  var responses: `200Content108`
}
object Parameters107 {
  
  inline def apply(parameters: `107`, responses: `200Content108`): Parameters107 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters107]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters107] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `107`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content108`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
