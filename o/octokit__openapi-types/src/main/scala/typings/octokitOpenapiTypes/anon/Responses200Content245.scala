package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content245 extends StObject {
  
  var parameters: `135`
  
  var responses: `200Content245`
}
object Responses200Content245 {
  
  inline def apply(parameters: `135`, responses: `200Content245`): Responses200Content245 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content245]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content245] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content245`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
