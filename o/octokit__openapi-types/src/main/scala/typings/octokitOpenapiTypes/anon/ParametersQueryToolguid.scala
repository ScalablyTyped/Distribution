package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryToolguid extends StObject {
  
  var parameters: QueryToolguid
  
  var responses: `403404503`
}
object ParametersQueryToolguid {
  
  inline def apply(parameters: QueryToolguid, responses: `403404503`): ParametersQueryToolguid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryToolguid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryToolguid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryToolguid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
