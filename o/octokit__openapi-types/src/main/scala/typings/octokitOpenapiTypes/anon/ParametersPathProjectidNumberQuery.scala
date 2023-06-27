package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidNumberQuery extends StObject {
  
  var parameters: PathProjectidNumberQuery
  
  var responses: `200Content592HeadersLinkString304`
}
object ParametersPathProjectidNumberQuery {
  
  inline def apply(parameters: PathProjectidNumberQuery, responses: `200Content592HeadersLinkString304`): ParametersPathProjectidNumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathProjectidNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidNumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content592HeadersLinkString304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
