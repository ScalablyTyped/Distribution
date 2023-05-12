package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery548 extends StObject {
  
  var parameters: Query548
  
  var responses: `549`
}
object ParametersQuery548 {
  
  inline def apply(parameters: Query548, responses: `549`): ParametersQuery548 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery548]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery548] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query548): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `549`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
