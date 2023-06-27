package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommitshaQuery extends StObject {
  
  var parameters: PathCommitshaQuery
  
  var responses: `200Content249`
}
object ParametersPathCommitshaQuery {
  
  inline def apply(parameters: PathCommitshaQuery, responses: `200Content249`): ParametersPathCommitshaQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommitshaQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommitshaQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommitshaQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content249`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
