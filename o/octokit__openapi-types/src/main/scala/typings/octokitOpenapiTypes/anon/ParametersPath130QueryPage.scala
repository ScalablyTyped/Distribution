package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath130QueryPage extends StObject {
  
  var parameters: Path130QueryPage
  
  var responses: `200Content133`
}
object ParametersPath130QueryPage {
  
  inline def apply(parameters: Path130QueryPage, responses: `200Content133`): ParametersPath130QueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath130QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath130QueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path130QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content133`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
