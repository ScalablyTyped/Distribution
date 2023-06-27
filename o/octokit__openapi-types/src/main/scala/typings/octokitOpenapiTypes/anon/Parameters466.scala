package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters466 extends StObject {
  
  var parameters: `466`
  
  var responses: `304401403422`
}
object Parameters466 {
  
  inline def apply(parameters: `466`, responses: `304401403422`): Parameters466 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters466]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters466] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `466`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
