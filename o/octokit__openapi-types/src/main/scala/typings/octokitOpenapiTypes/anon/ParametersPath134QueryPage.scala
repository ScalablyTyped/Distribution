package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath134QueryPage extends StObject {
  
  var parameters: Path134QueryPage
  
  var responses: `200Content137`
}
object ParametersPath134QueryPage {
  
  inline def apply(parameters: Path134QueryPage, responses: `200Content137`): ParametersPath134QueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath134QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath134QueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path134QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content137`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
