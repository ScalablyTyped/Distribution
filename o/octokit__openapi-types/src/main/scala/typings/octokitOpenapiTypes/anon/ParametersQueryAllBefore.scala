package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAllBefore extends StObject {
  
  var parameters: QueryAllBefore
  
  var responses: `200Content491`
}
object ParametersQueryAllBefore {
  
  inline def apply(parameters: QueryAllBefore, responses: `200Content491`): ParametersQueryAllBefore = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAllBefore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryAllBefore] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryAllBefore): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content491`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
