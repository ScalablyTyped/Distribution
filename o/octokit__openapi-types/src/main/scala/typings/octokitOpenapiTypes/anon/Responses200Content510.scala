package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content510 extends StObject {
  
  var parameters: `496`
  
  var responses: `200Content510`
}
object Responses200Content510 {
  
  inline def apply(parameters: `496`, responses: `200Content510`): Responses200Content510 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content510]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content510] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content510`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
