package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content594 extends StObject {
  
  var parameters: `416`
  
  var responses: `200Content594`
}
object Responses200Content594 {
  
  inline def apply(parameters: `416`, responses: `200Content594`): Responses200Content594 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content594]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content594] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `416`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content594`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
