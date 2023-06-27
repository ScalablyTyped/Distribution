package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypeUsernameQuery extends StObject {
  
  var parameters: PathPackagenamePackagetypeUsernameQuery
  
  var responses: `401Content41403Content41`
}
object ParametersPathPackagenamePackagetypeUsernameQuery {
  
  inline def apply(parameters: PathPackagenamePackagetypeUsernameQuery, responses: `401Content41403Content41`): ParametersPathPackagenamePackagetypeUsernameQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypeUsernameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenamePackagetypeUsernameQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenamePackagetypeUsernameQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content41403Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
