package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content250 extends StObject {
  
  var parameters: `248`
  
  var responses: `200Content250`
}
object Responses200Content250 {
  
  inline def apply(parameters: `248`, responses: `200Content250`): Responses200Content250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content250]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content250] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `248`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content250`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
