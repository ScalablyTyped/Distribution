package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath370QueryPage extends StObject {
  
  var parameters: Path370QueryPage
  
  var responses: `200Content16`
}
object ParametersPath370QueryPage {
  
  inline def apply(parameters: Path370QueryPage, responses: `200Content16`): ParametersPath370QueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath370QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath370QueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content16`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
