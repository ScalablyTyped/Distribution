package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectid extends StObject {
  
  var parameters: PathProjectid
  
  var responses: `200Content120`
}
object ParametersPathProjectid {
  
  inline def apply(parameters: PathProjectid, responses: `200Content120`): ParametersPathProjectid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectid]
  }
  
  extension [Self <: ParametersPathProjectid](x: Self) {
    
    inline def setParameters(value: PathProjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content120`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
