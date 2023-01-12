package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameString extends StObject {
  
  var parameters: PathNameString
  
  var responses: `200Content42`
}
object ParametersPathNameString {
  
  inline def apply(parameters: PathNameString, responses: `200Content42`): ParametersPathNameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content42`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
