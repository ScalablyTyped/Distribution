package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberQuery extends StObject {
  
  var parameters: PathDiscussionnumberQuery
  
  var responses: `200Content136`
}
object ParametersPathDiscussionnumberQuery {
  
  inline def apply(parameters: PathDiscussionnumberQuery, responses: `200Content136`): ParametersPathDiscussionnumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content136`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
