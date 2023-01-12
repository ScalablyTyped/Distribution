package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery248 extends StObject {
  
  var parameters: Query248
  
  var responses: `200Content249`
}
object ParametersQuery248 {
  
  inline def apply(parameters: Query248, responses: `200Content249`): ParametersQuery248 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery248]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery248] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query248): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content249`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
