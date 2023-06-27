package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters446 extends StObject {
  
  var parameters: `446`
  
  var responses: `401403404`
}
object Parameters446 {
  
  inline def apply(parameters: `446`, responses: `401403404`): Parameters446 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters446]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters446] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `446`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
