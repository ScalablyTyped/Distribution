package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses384 extends StObject {
  
  var parameters: Path348QueryPage
  
  var responses: `384`
}
object Responses384 {
  
  inline def apply(parameters: Path348QueryPage, responses: `384`): Responses384 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses384]
  }
  
  extension [Self <: Responses384](x: Self) {
    
    inline def setParameters(value: Path348QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `384`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
