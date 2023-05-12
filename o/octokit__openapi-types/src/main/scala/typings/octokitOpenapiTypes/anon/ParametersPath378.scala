package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath378 extends StObject {
  
  var parameters: Path378
  
  var responses: `403404500`
}
object ParametersPath378 {
  
  inline def apply(parameters: Path378, responses: `403404500`): ParametersPath378 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath378]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath378] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path378): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
