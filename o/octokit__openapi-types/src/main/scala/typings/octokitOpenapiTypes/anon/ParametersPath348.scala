package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath348 extends StObject {
  
  var parameters: Path348
  
  var responses: `403404Content48`
}
object ParametersPath348 {
  
  inline def apply(parameters: Path348, responses: `403404Content48`): ParametersPath348 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath348]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath348] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path348): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
