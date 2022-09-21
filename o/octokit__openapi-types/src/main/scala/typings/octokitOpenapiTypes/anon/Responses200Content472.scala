package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content472 extends StObject {
  
  var parameters: PathPackagenamePackagetypeUsername
  
  var responses: `200Content472`
}
object Responses200Content472 {
  
  inline def apply(parameters: PathPackagenamePackagetypeUsername, responses: `200Content472`): Responses200Content472 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content472]
  }
  
  extension [Self <: Responses200Content472](x: Self) {
    
    inline def setParameters(value: PathPackagenamePackagetypeUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content472`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
