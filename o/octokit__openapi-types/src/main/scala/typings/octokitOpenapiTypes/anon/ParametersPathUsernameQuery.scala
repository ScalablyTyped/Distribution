package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameQuery extends StObject {
  
  var parameters: PathUsernameQuery
  
  var responses: `401403404`
}
object ParametersPathUsernameQuery {
  
  inline def apply(parameters: PathUsernameQuery, responses: `401403404`): ParametersPathUsernameQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathUsernameQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsernameQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
