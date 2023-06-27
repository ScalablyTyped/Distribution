package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringQuery extends StObject {
  
  var parameters: PathUsernameStringQuery
  
  var responses: `200304401403404500`
}
object ParametersPathUsernameStringQuery {
  
  inline def apply(parameters: PathUsernameStringQuery, responses: `200304401403404500`): ParametersPathUsernameStringQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathUsernameStringQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsernameStringQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
