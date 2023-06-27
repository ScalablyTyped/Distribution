package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters365 extends StObject {
  
  var parameters: `365`
  
  var responses: `304422`
}
object Parameters365 {
  
  inline def apply(parameters: `365`, responses: `304422`): Parameters365 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters365]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters365] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `365`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
