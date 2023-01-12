package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryCursor extends StObject {
  
  var parameters: QueryCursor
  
  var responses: `400`
}
object ParametersQueryCursor {
  
  inline def apply(parameters: QueryCursor, responses: `400`): ParametersQueryCursor = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryCursor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryCursor] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryCursor): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
