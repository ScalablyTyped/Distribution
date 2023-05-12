package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAttemptnumber extends StObject {
  
  var parameters: PathAttemptnumber
  
  var responses: `200Content153`
}
object ParametersPathAttemptnumber {
  
  inline def apply(parameters: PathAttemptnumber, responses: `200Content153`): ParametersPathAttemptnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAttemptnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAttemptnumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAttemptnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content153`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
