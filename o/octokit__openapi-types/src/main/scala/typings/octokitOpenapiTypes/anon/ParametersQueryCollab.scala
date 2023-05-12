package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryCollab extends StObject {
  
  var parameters: QueryCollab
  
  var responses: `200304404`
}
object ParametersQueryCollab {
  
  inline def apply(parameters: QueryCollab, responses: `200304404`): ParametersQueryCollab = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryCollab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryCollab] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryCollab): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
