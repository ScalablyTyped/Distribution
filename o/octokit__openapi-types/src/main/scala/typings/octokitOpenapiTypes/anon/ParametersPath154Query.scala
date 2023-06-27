package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath154Query extends StObject {
  
  var parameters: Path154Query
  
  var responses: `200Content156`
}
object ParametersPath154Query {
  
  inline def apply(parameters: Path154Query, responses: `200Content156`): ParametersPath154Query = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath154Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath154Query] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path154Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content156`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
