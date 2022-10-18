package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content341403 extends StObject {
  
  var parameters: Path300
  
  var responses: `200Content341403`
}
object Responses200Content341403 {
  
  inline def apply(parameters: Path300, responses: `200Content341403`): Responses200Content341403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content341403]
  }
  
  extension [Self <: Responses200Content341403](x: Self) {
    
    inline def setParameters(value: Path300): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content341403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
