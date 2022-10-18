package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content110 extends StObject {
  
  var parameters: PathOwnerRepo
  
  var responses: `200Content110`
}
object Responses200Content110 {
  
  inline def apply(parameters: PathOwnerRepo, responses: `200Content110`): Responses200Content110 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content110]
  }
  
  extension [Self <: Responses200Content110](x: Self) {
    
    inline def setParameters(value: PathOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content110`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
