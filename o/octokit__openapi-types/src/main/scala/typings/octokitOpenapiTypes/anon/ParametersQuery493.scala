package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery493 extends StObject {
  
  var parameters: Query493
  
  var responses: `200Content494`
}
object ParametersQuery493 {
  
  inline def apply(parameters: Query493, responses: `200Content494`): ParametersQuery493 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery493]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery493] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query493): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content494`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
