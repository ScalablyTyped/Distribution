package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryFirst extends StObject {
  
  var parameters: QueryFirst
  
  var responses: `304400403`
}
object ParametersQueryFirst {
  
  inline def apply(parameters: QueryFirst, responses: `304400403`): ParametersQueryFirst = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryFirst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryFirst] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryFirst): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
