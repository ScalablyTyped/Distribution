package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryProtected extends StObject {
  
  var parameters: QueryProtected
  
  var responses: `200Content172`
}
object ParametersQueryProtected {
  
  inline def apply(parameters: QueryProtected, responses: `200Content172`): ParametersQueryProtected = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryProtected]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryProtected] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryProtected): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content172`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
