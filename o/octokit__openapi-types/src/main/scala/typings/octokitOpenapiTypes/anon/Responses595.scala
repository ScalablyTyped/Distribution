package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses595 extends StObject {
  
  var parameters: Path577Query407
  
  var responses: `595`
}
object Responses595 {
  
  inline def apply(parameters: Path577Query407, responses: `595`): Responses595 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses595]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses595] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path577Query407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `595`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
