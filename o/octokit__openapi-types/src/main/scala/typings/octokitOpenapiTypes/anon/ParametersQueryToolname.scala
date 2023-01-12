package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryToolname extends StObject {
  
  var parameters: QueryToolname
  
  var responses: `200Content414`
}
object ParametersQueryToolname {
  
  inline def apply(parameters: QueryToolname, responses: `200Content414`): ParametersQueryToolname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryToolname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryToolname] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryToolname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content414`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
