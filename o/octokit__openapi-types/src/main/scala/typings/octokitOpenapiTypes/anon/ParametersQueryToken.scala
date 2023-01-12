package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryToken extends StObject {
  
  var parameters: QueryToken
  
  var responses: `401403404`
}
object ParametersQueryToken {
  
  inline def apply(parameters: QueryToken, responses: `401403404`): ParametersQueryToken = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryToken] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryToken): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
