package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content241 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200Content241`
}
object Responses200Content241 {
  
  inline def apply(parameters: PathOwner, responses: `200Content241`): Responses200Content241 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content241]
  }
  
  extension [Self <: Responses200Content241](x: Self) {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content241`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
