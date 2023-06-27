package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses445 extends StObject {
  
  var parameters: Path444
  
  var responses: `445`
}
object Responses445 {
  
  inline def apply(parameters: Path444, responses: `445`): Responses445 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses445]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses445] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path444): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `445`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
