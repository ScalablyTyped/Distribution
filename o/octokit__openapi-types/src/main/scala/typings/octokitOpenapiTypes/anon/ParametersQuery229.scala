package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery229 extends StObject {
  
  var parameters: Query229
  
  var responses: `200Content230`
}
object ParametersQuery229 {
  
  inline def apply(parameters: Query229, responses: `200Content230`): ParametersQuery229 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery229]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery229] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query229): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content230`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
