package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content395 extends StObject {
  
  var parameters: Path361QueryPage
  
  var responses: `200Content395`
}
object Responses200Content395 {
  
  inline def apply(parameters: Path361QueryPage, responses: `200Content395`): Responses200Content395 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content395]
  }
  
  extension [Self <: Responses200Content395](x: Self) {
    
    inline def setParameters(value: Path361QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content395`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
