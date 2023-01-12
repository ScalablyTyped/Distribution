package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content313 extends StObject {
  
  var parameters: Query188
  
  var responses: `200Content313`
}
object Responses200Content313 {
  
  inline def apply(parameters: Query188, responses: `200Content313`): Responses200Content313 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content313]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content313] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query188): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content313`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
