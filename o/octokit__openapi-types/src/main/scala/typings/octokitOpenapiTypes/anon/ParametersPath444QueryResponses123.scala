package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath444QueryResponses123 extends StObject {
  
  var parameters: Path444Query
  
  var responses: `123`
}
object ParametersPath444QueryResponses123 {
  
  inline def apply(parameters: Path444Query, responses: `123`): ParametersPath444QueryResponses123 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath444QueryResponses123]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath444QueryResponses123] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path444Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `123`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
