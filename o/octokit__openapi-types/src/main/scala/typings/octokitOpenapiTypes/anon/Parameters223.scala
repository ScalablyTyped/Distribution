package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters223 extends StObject {
  
  var parameters: `223`
  
  var responses: `403404503`
}
object Parameters223 {
  
  inline def apply(parameters: `223`, responses: `403404503`): Parameters223 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters223]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters223] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `223`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
