package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters734 extends StObject {
  
  var parameters: `734`
  
  var responses: `735`
}
object Parameters734 {
  
  inline def apply(parameters: `734`, responses: `735`): Parameters734 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters734]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters734] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `734`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `735`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
