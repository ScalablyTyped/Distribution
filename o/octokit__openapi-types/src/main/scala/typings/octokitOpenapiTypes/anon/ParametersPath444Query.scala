package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath444Query extends StObject {
  
  var parameters: Path444Query
  
  var responses: `200Content18`
}
object ParametersPath444Query {
  
  inline def apply(parameters: Path444Query, responses: `200Content18`): ParametersPath444Query = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath444Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath444Query] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path444Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content18`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
