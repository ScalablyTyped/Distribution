package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDirectionEcosystem extends StObject {
  
  var parameters: QueryDirectionEcosystem
  
  var responses: `200Content479`
}
object ParametersQueryDirectionEcosystem {
  
  inline def apply(parameters: QueryDirectionEcosystem, responses: `200Content479`): ParametersQueryDirectionEcosystem = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDirectionEcosystem]
  }
  
  extension [Self <: ParametersQueryDirectionEcosystem](x: Self) {
    
    inline def setParameters(value: QueryDirectionEcosystem): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content479`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
