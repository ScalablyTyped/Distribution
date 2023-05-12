package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath649Query524 extends StObject {
  
  var parameters: Path649Query524
  
  var responses: `200Content525422Content346`
}
object ParametersPath649Query524 {
  
  inline def apply(parameters: Path649Query524, responses: `200Content525422Content346`): ParametersPath649Query524 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath649Query524]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath649Query524] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649Query524): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content525422Content346`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
