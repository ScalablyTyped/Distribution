package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReleaseidQuery extends StObject {
  
  var parameters: PathReleaseidQuery
  
  var responses: `200Content389`
}
object ParametersPathReleaseidQuery {
  
  inline def apply(parameters: PathReleaseidQuery, responses: `200Content389`): ParametersPathReleaseidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReleaseidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathReleaseidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReleaseidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content389`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
