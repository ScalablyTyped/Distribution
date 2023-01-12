package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery478 extends StObject {
  
  var parameters: Query478
  
  var responses: `479`
}
object ParametersQuery478 {
  
  inline def apply(parameters: Query478, responses: `479`): ParametersQuery478 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery478]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery478] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query478): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `479`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
