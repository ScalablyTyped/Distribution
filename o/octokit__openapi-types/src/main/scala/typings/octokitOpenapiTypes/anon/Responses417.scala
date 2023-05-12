package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses417 extends StObject {
  
  var parameters: Path370QueryPage
  
  var responses: `417`
}
object Responses417 {
  
  inline def apply(parameters: Path370QueryPage, responses: `417`): Responses417 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses417]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses417] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `417`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
