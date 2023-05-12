package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content528 extends StObject {
  
  var parameters: `496`
  
  var responses: `200Content528`
}
object Responses200Content528 {
  
  inline def apply(parameters: `496`, responses: `200Content528`): Responses200Content528 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content528]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content528] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content528`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
