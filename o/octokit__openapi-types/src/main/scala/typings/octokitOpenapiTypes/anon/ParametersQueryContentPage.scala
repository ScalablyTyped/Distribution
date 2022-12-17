package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryContentPage extends StObject {
  
  var parameters: QueryContentPage
  
  var responses: `200Content112`
}
object ParametersQueryContentPage {
  
  inline def apply(parameters: QueryContentPage, responses: `200Content112`): ParametersQueryContentPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryContentPage]
  }
  
  extension [Self <: ParametersQueryContentPage](x: Self) {
    
    inline def setParameters(value: QueryContentPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content112`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
