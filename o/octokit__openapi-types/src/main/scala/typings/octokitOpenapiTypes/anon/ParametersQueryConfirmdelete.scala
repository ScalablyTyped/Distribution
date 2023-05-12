package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryConfirmdelete extends StObject {
  
  var parameters: QueryConfirmdelete
  
  var responses: `400403`
}
object ParametersQueryConfirmdelete {
  
  inline def apply(parameters: QueryConfirmdelete, responses: `400403`): ParametersQueryConfirmdelete = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryConfirmdelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryConfirmdelete] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryConfirmdelete): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
