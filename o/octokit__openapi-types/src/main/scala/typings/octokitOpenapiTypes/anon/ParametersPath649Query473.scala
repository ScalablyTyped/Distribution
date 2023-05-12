package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath649Query473 extends StObject {
  
  var parameters: Path649Query473
  
  var responses: `200Content480`
}
object ParametersPath649Query473 {
  
  inline def apply(parameters: Path649Query473, responses: `200Content480`): ParametersPath649Query473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath649Query473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath649Query473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649Query473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content480`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
