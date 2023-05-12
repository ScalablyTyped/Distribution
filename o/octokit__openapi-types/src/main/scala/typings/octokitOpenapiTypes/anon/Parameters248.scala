package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters248 extends StObject {
  
  var parameters: `248`
  
  var responses: `200Content249`
}
object Parameters248 {
  
  inline def apply(parameters: `248`, responses: `200Content249`): Parameters248 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters248]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters248] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `248`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content249`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
