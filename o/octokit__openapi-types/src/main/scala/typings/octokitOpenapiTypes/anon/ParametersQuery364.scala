package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery364 extends StObject {
  
  var parameters: Query364
  
  var responses: `200304422`
}
object ParametersQuery364 {
  
  inline def apply(parameters: Query364, responses: `200304422`): ParametersQuery364 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery364]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery364] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query364): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
