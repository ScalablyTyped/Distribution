package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryEcosystem extends StObject {
  
  var parameters: QueryEcosystem
  
  var responses: `304403404422`
}
object ParametersQueryEcosystem {
  
  inline def apply(parameters: QueryEcosystem, responses: `304403404422`): ParametersQueryEcosystem = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryEcosystem]
  }
  
  extension [Self <: ParametersQueryEcosystem](x: Self) {
    
    inline def setParameters(value: QueryEcosystem): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
