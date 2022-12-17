package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters588 extends StObject {
  
  var parameters: `588`
  
  var responses: `304Unknown401Content48`
}
object Parameters588 {
  
  inline def apply(parameters: `588`, responses: `304Unknown401Content48`): Parameters588 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters588]
  }
  
  extension [Self <: Parameters588](x: Self) {
    
    inline def setParameters(value: `588`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown401Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
