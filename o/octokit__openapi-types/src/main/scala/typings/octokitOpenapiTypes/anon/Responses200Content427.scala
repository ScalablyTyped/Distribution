package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content427 extends StObject {
  
  var parameters: `416`
  
  var responses: `200Content427`
}
object Responses200Content427 {
  
  inline def apply(parameters: `416`, responses: `200Content427`): Responses200Content427 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content427]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content427] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `416`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content427`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
