package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryLoginPage extends StObject {
  
  var parameters: QueryLoginPage
  
  var responses: `200Content456`
}
object ParametersQueryLoginPage {
  
  inline def apply(parameters: QueryLoginPage, responses: `200Content456`): ParametersQueryLoginPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryLoginPage]
  }
  
  extension [Self <: ParametersQueryLoginPage](x: Self) {
    
    inline def setParameters(value: QueryLoginPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content456`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
