package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypeUsernameQuery extends StObject {
  
  var parameters: PathPackagetypeUsernameQuery
  
  var responses: `115`
}
object ParametersPathPackagetypeUsernameQuery {
  
  inline def apply(parameters: PathPackagetypeUsernameQuery, responses: `115`): ParametersPathPackagetypeUsernameQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypeUsernameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagetypeUsernameQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagetypeUsernameQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `115`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
