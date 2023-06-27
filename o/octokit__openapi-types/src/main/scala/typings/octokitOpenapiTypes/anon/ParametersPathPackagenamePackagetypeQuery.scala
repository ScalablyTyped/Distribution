package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypeQuery extends StObject {
  
  var parameters: PathPackagenamePackagetypeQuery
  
  var responses: `115`
}
object ParametersPathPackagenamePackagetypeQuery {
  
  inline def apply(parameters: PathPackagenamePackagetypeQuery, responses: `115`): ParametersPathPackagenamePackagetypeQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypeQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenamePackagetypeQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenamePackagetypeQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `115`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
