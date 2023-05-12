package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath370 extends StObject {
  
  var parameters: Path370
  
  var responses: `403404Content36`
}
object ParametersPath370 {
  
  inline def apply(parameters: Path370, responses: `403404Content36`): ParametersPath370 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath370]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath370] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
