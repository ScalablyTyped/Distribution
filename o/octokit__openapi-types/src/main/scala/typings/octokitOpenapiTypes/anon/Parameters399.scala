package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters399 extends StObject {
  
  var parameters: `399`
  
  var responses: `200Content402`
}
object Parameters399 {
  
  inline def apply(parameters: `399`, responses: `200Content402`): Parameters399 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters399]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters399] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `399`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content402`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
