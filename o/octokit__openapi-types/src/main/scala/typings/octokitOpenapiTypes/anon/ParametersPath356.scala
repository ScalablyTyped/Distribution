package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath356 extends StObject {
  
  var parameters: Path356
  
  var responses: `404500`
}
object ParametersPath356 {
  
  inline def apply(parameters: Path356, responses: `404500`): ParametersPath356 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath356]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath356] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path356): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
