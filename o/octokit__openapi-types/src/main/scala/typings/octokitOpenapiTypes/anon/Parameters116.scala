package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters116 extends StObject {
  
  var parameters: `116`
  
  var responses: `200401403404`
}
object Parameters116 {
  
  inline def apply(parameters: `116`, responses: `200401403404`): Parameters116 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters116]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters116] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `116`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
