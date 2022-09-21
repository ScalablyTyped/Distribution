package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameOrg extends StObject {
  
  var parameters: PathNameOrg
  
  var responses: `404422`
}
object ParametersPathNameOrg {
  
  inline def apply(parameters: PathNameOrg, responses: `404422`): ParametersPathNameOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameOrg]
  }
  
  extension [Self <: ParametersPathNameOrg](x: Self) {
    
    inline def setParameters(value: PathNameOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
