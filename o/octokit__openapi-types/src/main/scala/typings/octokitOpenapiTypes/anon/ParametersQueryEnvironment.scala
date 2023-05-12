package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryEnvironment extends StObject {
  
  var parameters: QueryEnvironment
  
  var responses: `200Content160HeadersLink`
}
object ParametersQueryEnvironment {
  
  inline def apply(parameters: QueryEnvironment, responses: `200Content160HeadersLink`): ParametersQueryEnvironment = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryEnvironment] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryEnvironment): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content160HeadersLink`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
