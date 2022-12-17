package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content423 extends StObject {
  
  var parameters: PathGistidStringQuery407
  
  var responses: `200Content423`
}
object Responses200Content423 {
  
  inline def apply(parameters: PathGistidStringQuery407, responses: `200Content423`): Responses200Content423 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content423]
  }
  
  extension [Self <: Responses200Content423](x: Self) {
    
    inline def setParameters(value: PathGistidStringQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content423`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
