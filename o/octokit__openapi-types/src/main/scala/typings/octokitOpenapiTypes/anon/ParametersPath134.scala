package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath134 extends StObject {
  
  var parameters: Path134
  
  var responses: `200Content103`
}
object ParametersPath134 {
  
  inline def apply(parameters: Path134, responses: `200Content103`): ParametersPath134 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath134]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath134] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path134): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content103`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
