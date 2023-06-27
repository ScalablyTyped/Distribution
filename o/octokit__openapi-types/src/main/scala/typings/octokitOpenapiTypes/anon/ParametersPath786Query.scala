package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath786Query extends StObject {
  
  var parameters: Path786Query
  
  var responses: `200Content561`
}
object ParametersPath786Query {
  
  inline def apply(parameters: Path786Query, responses: `200Content561`): ParametersPath786Query = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath786Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath786Query] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path786Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content561`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
