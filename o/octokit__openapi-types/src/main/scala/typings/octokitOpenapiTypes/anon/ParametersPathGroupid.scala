package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGroupid extends StObject {
  
  var parameters: PathGroupid
  
  var responses: `200Content79`
}
object ParametersPathGroupid {
  
  inline def apply(parameters: PathGroupid, responses: `200Content79`): ParametersPathGroupid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGroupid]
  }
  
  extension [Self <: ParametersPathGroupid](x: Self) {
    
    inline def setParameters(value: PathGroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content79`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
