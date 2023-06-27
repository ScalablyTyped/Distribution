package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content294 extends StObject {
  
  var parameters: `292`
  
  var responses: `200Content294`
}
object Responses200Content294 {
  
  inline def apply(parameters: `292`, responses: `200Content294`): Responses200Content294 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content294]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content294] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `292`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content294`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
