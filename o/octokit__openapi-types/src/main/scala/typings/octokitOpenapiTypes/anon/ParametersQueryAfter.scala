package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAfter extends StObject {
  
  var parameters: QueryAfter
  
  var responses: `304400`
}
object ParametersQueryAfter {
  
  inline def apply(parameters: QueryAfter, responses: `304400`): ParametersQueryAfter = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAfter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryAfter] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryAfter): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
