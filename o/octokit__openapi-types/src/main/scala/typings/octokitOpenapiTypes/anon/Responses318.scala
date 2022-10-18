package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses318 extends StObject {
  
  var parameters: Query309
  
  var responses: `318`
}
object Responses318 {
  
  inline def apply(parameters: Query309, responses: `318`): Responses318 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses318]
  }
  
  extension [Self <: Responses318](x: Self) {
    
    inline def setParameters(value: Query309): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `318`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
