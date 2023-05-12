package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery553 extends StObject {
  
  var parameters: Query553
  
  var responses: `200Content554`
}
object ParametersQuery553 {
  
  inline def apply(parameters: Query553, responses: `200Content554`): ParametersQuery553 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery553]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery553] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query553): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content554`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
