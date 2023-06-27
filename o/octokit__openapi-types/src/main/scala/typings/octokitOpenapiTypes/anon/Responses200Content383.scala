package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content383 extends StObject {
  
  var parameters: `238`
  
  var responses: `200Content383`
}
object Responses200Content383 {
  
  inline def apply(parameters: `238`, responses: `200Content383`): Responses200Content383 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content383]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content383] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `238`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content383`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
