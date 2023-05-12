package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTagsha extends StObject {
  
  var parameters: PathTagsha
  
  var responses: `200252`
}
object ParametersPathTagsha {
  
  inline def apply(parameters: PathTagsha, responses: `200252`): ParametersPathTagsha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTagsha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTagsha] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTagsha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200252`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
