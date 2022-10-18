package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryEnvironmentPage extends StObject {
  
  var parameters: QueryEnvironmentPage
  
  var responses: `200Content426Headers`
}
object ParametersQueryEnvironmentPage {
  
  inline def apply(parameters: QueryEnvironmentPage, responses: `200Content426Headers`): ParametersQueryEnvironmentPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryEnvironmentPage]
  }
  
  extension [Self <: ParametersQueryEnvironmentPage](x: Self) {
    
    inline def setParameters(value: QueryEnvironmentPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content426Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
