package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery660 extends StObject {
  
  var parameters: Query660
  
  var responses: `200Content661`
}
object ParametersQuery660 {
  
  inline def apply(parameters: Query660, responses: `200Content661`): ParametersQuery660 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery660]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery660] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query660): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content661`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
