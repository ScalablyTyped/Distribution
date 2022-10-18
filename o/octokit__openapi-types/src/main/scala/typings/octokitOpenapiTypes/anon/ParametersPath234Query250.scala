package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath234Query250 extends StObject {
  
  var parameters: Path234Query250
  
  var responses: `200ContentApplicationjsonRepositoriesArrayRepositoryselection`
}
object ParametersPath234Query250 {
  
  inline def apply(
    parameters: Path234Query250,
    responses: `200ContentApplicationjsonRepositoriesArrayRepositoryselection`
  ): ParametersPath234Query250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath234Query250]
  }
  
  extension [Self <: ParametersPath234Query250](x: Self) {
    
    inline def setParameters(value: Path234Query250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayRepositoryselection`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
