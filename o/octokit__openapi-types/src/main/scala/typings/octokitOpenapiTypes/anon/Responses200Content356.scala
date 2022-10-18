package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content356 extends StObject {
  
  var parameters: PathPackagenamePackagetypeUsername
  
  var responses: `200Content356`
}
object Responses200Content356 {
  
  inline def apply(parameters: PathPackagenamePackagetypeUsername, responses: `200Content356`): Responses200Content356 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content356]
  }
  
  extension [Self <: Responses200Content356](x: Self) {
    
    inline def setParameters(value: PathPackagenamePackagetypeUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content356`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
