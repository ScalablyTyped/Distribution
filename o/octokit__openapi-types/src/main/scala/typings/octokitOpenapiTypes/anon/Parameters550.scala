package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters550 extends StObject {
  
  var parameters: `550`
  
  var responses: `400422`
}
object Parameters550 {
  
  inline def apply(parameters: `550`, responses: `400422`): Parameters550 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters550]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters550] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `550`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
