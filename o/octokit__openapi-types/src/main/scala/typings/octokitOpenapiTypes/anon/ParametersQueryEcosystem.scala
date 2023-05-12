package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryEcosystem extends StObject {
  
  var parameters: QueryEcosystem
  
  var responses: `200304400`
}
object ParametersQueryEcosystem {
  
  inline def apply(parameters: QueryEcosystem, responses: `200304400`): ParametersQueryEcosystem = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryEcosystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryEcosystem] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryEcosystem): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
