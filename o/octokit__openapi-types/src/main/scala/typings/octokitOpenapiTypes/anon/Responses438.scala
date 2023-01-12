package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses438 extends StObject {
  
  var parameters: Query434
  
  var responses: `438`
}
object Responses438 {
  
  inline def apply(parameters: Query434, responses: `438`): Responses438 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses438]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses438] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query434): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `438`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
