package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses396 extends StObject {
  
  var parameters: Path361QueryPage
  
  var responses: `396`
}
object Responses396 {
  
  inline def apply(parameters: Path361QueryPage, responses: `396`): Responses396 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses396]
  }
  
  extension [Self <: Responses396](x: Self) {
    
    inline def setParameters(value: Path361QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `396`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
