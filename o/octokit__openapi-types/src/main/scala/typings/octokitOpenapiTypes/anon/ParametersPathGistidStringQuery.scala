package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGistidStringQuery extends StObject {
  
  var parameters: PathGistidStringQuery
  
  var responses: `200Content565`
}
object ParametersPathGistidStringQuery {
  
  inline def apply(parameters: PathGistidStringQuery, responses: `200Content565`): ParametersPathGistidStringQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGistidStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathGistidStringQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidStringQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content565`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
