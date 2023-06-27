package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath786Responses600 extends StObject {
  
  var parameters: Path786
  
  var responses: `600`
}
object ParametersPath786Responses600 {
  
  inline def apply(parameters: Path786, responses: `600`): ParametersPath786Responses600 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath786Responses600]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath786Responses600] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path786): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `600`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
