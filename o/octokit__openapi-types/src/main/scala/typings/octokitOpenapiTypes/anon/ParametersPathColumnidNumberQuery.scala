package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathColumnidNumberQuery extends StObject {
  
  var parameters: PathColumnidNumberQuery
  
  var responses: `200Content636`
}
object ParametersPathColumnidNumberQuery {
  
  inline def apply(parameters: PathColumnidNumberQuery, responses: `200Content636`): ParametersPathColumnidNumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathColumnidNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathColumnidNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathColumnidNumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content636`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
