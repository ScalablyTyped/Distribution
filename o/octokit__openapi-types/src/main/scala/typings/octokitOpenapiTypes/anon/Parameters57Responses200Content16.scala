package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters57Responses200Content16 extends StObject {
  
  var parameters: `57`
  
  var responses: `200Content16`
}
object Parameters57Responses200Content16 {
  
  inline def apply(parameters: `57`, responses: `200Content16`): Parameters57Responses200Content16 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters57Responses200Content16]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters57Responses200Content16] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content16`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
