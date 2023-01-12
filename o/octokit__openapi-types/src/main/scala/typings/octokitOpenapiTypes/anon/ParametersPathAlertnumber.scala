package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAlertnumber extends StObject {
  
  var parameters: PathAlertnumber
  
  var responses: `304403404503`
}
object ParametersPathAlertnumber {
  
  inline def apply(parameters: PathAlertnumber, responses: `304403404503`): ParametersPathAlertnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAlertnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAlertnumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
