package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRunnersTotalcount extends StObject {
  
  var parameters: PathEnterpriseRunnergroupidQuery250
  
  var responses: `200ContentApplicationjsonRunnersTotalcount`
}
object Responses200ContentApplicationjsonRunnersTotalcount {
  
  inline def apply(
    parameters: PathEnterpriseRunnergroupidQuery250,
    responses: `200ContentApplicationjsonRunnersTotalcount`
  ): Responses200ContentApplicationjsonRunnersTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRunnersTotalcount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRunnersTotalcount](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnergroupidQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunnersTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
