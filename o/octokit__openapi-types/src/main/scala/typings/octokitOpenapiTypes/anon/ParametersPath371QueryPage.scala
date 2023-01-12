package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath371QueryPage extends StObject {
  
  var parameters: Path371QueryPage
  
  var responses: `200Content93`
}
object ParametersPath371QueryPage {
  
  inline def apply(parameters: Path371QueryPage, responses: `200Content93`): ParametersPath371QueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath371QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath371QueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path371QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content93`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
