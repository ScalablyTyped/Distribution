package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200304401404 extends StObject {
  
  var parameters: `416`
  
  var responses: `200304401404`
}
object Responses200304401404 {
  
  inline def apply(parameters: `416`, responses: `200304401404`): Responses200304401404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200304401404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200304401404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `416`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
