package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content289 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200Content289`
}
object Responses200Content289 {
  
  inline def apply(parameters: PathOwner, responses: `200Content289`): Responses200Content289 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content289]
  }
  
  extension [Self <: Responses200Content289](x: Self) {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content289`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
