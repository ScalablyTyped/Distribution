package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery464 extends StObject {
  
  var parameters: Query464
  
  var responses: `200Content465`
}
object ParametersQuery464 {
  
  inline def apply(parameters: Query464, responses: `200Content465`): ParametersQuery464 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery464]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery464] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query464): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content465`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
