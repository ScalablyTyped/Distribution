package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses205304403 extends StObject {
  
  var parameters: Path294
  
  var responses: `205304403`
}
object Responses205304403 {
  
  inline def apply(parameters: Path294, responses: `205304403`): Responses205304403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses205304403]
  }
  
  extension [Self <: Responses205304403](x: Self) {
    
    inline def setParameters(value: Path294): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `205304403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
