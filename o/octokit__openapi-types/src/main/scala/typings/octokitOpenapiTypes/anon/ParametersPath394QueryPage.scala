package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath394QueryPage extends StObject {
  
  var parameters: Path394QueryPage
  
  var responses: `200Content48`
}
object ParametersPath394QueryPage {
  
  inline def apply(parameters: Path394QueryPage, responses: `200Content48`): ParametersPath394QueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath394QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath394QueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path394QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
