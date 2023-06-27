package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath470Query extends StObject {
  
  var parameters: Path470Query
  
  var responses: `200Content56`
}
object ParametersPath470Query {
  
  inline def apply(parameters: Path470Query, responses: `200Content56`): ParametersPath470Query = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath470Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath470Query] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path470Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content56`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
