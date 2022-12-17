package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content38 extends StObject {
  
  var parameters: PathGistidQueryPage
  
  var responses: `200Content38`
}
object Responses200Content38 {
  
  inline def apply(parameters: PathGistidQueryPage, responses: `200Content38`): Responses200Content38 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content38]
  }
  
  extension [Self <: Responses200Content38](x: Self) {
    
    inline def setParameters(value: PathGistidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content38`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
