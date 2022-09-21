package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses140 extends StObject {
  
  var parameters: PathProjectidUsername
  
  var responses: `140`
}
object Responses140 {
  
  inline def apply(parameters: PathProjectidUsername, responses: `140`): Responses140 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses140]
  }
  
  extension [Self <: Responses140](x: Self) {
    
    inline def setParameters(value: PathProjectidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `140`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
