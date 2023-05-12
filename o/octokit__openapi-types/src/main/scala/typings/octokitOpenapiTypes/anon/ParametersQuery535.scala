package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery535 extends StObject {
  
  var parameters: Query535
  
  var responses: `521`
}
object ParametersQuery535 {
  
  inline def apply(parameters: Query535, responses: `521`): ParametersQuery535 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery535]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery535] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query535): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `521`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
