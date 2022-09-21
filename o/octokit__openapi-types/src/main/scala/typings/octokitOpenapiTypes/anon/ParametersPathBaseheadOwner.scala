package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBaseheadOwner extends StObject {
  
  var parameters: PathBaseheadOwner
  
  var responses: `404500503`
}
object ParametersPathBaseheadOwner {
  
  inline def apply(parameters: PathBaseheadOwner, responses: `404500503`): ParametersPathBaseheadOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBaseheadOwner]
  }
  
  extension [Self <: ParametersPathBaseheadOwner](x: Self) {
    
    inline def setParameters(value: PathBaseheadOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404500503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
