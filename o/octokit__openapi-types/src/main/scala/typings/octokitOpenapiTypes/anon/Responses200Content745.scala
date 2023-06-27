package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content745 extends StObject {
  
  var parameters: `743`
  
  var responses: `200Content745`
}
object Responses200Content745 {
  
  inline def apply(parameters: `743`, responses: `200Content745`): Responses200Content745 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content745]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content745] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `743`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content745`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
