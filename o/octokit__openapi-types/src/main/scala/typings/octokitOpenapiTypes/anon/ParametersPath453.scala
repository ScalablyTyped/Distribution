package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath453 extends StObject {
  
  var parameters: Path453
  
  var responses: `403404500`
}
object ParametersPath453 {
  
  inline def apply(parameters: Path453, responses: `403404500`): ParametersPath453 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath453]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath453] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path453): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
