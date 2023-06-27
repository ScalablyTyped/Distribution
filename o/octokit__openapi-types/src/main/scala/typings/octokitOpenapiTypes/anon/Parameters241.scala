package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters241 extends StObject {
  
  var parameters: `241`
  
  var responses: `304401403404500`
}
object Parameters241 {
  
  inline def apply(parameters: `241`, responses: `304401403404500`): Parameters241 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters241]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters241] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `241`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
