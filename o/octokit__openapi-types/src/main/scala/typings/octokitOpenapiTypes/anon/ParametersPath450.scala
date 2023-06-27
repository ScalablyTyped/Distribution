package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath450 extends StObject {
  
  var parameters: Path450
  
  var responses: `200Content451`
}
object ParametersPath450 {
  
  inline def apply(parameters: Path450, responses: `200Content451`): ParametersPath450 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath450]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath450] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path450): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content451`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
