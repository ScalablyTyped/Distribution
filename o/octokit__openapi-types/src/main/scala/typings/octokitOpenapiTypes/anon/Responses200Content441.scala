package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content441 extends StObject {
  
  var parameters: PathGistidStringQuery426
  
  var responses: `200Content441`
}
object Responses200Content441 {
  
  inline def apply(parameters: PathGistidStringQuery426, responses: `200Content441`): Responses200Content441 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content441]
  }
  
  extension [Self <: Responses200Content441](x: Self) {
    
    inline def setParameters(value: PathGistidStringQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content441`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
