package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters625Responses500Content36 extends StObject {
  
  var parameters: `625`
  
  var responses: `500Content36`
}
object Parameters625Responses500Content36 {
  
  inline def apply(parameters: `625`, responses: `500Content36`): Parameters625Responses500Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters625Responses500Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters625Responses500Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `625`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `500Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
