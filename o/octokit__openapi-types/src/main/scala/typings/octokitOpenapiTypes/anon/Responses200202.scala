package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200202 extends StObject {
  
  var parameters: `135`
  
  var responses: `200202`
}
object Responses200202 {
  
  inline def apply(parameters: `135`, responses: `200202`): Responses200202 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200202]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200202] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200202`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
