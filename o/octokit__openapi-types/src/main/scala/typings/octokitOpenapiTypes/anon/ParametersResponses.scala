package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersResponses extends StObject {
  
  var parameters: Query
  
  var responses: `400`
}
object ParametersResponses {
  
  inline def apply(parameters: Query, responses: `400`): ParametersResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
