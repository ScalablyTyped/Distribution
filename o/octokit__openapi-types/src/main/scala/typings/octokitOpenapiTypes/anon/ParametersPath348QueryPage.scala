package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath348QueryPage extends StObject {
  
  var parameters: Path348QueryPage
  
  var responses: `200Content28`
}
object ParametersPath348QueryPage {
  
  inline def apply(parameters: Path348QueryPage, responses: `200Content28`): ParametersPath348QueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath348QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath348QueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path348QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content28`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
