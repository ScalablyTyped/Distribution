package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathScimuserid extends StObject {
  
  var parameters: PathScimuserid
  
  var responses: `200Content353`
}
object ParametersPathScimuserid {
  
  inline def apply(parameters: PathScimuserid, responses: `200Content353`): ParametersPathScimuserid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathScimuserid]
  }
  
  extension [Self <: ParametersPathScimuserid](x: Self) {
    
    inline def setParameters(value: PathScimuserid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content353`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
