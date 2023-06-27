package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberQuery extends StObject {
  
  var parameters: PathIssuenumberQuery
  
  var responses: `200404410`
}
object ParametersPathIssuenumberQuery {
  
  inline def apply(parameters: PathIssuenumberQuery, responses: `200404410`): ParametersPathIssuenumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
