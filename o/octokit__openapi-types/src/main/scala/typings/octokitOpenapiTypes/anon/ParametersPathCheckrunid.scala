package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCheckrunid extends StObject {
  
  var parameters: PathCheckrunid
  
  var responses: `200Content171`
}
object ParametersPathCheckrunid {
  
  inline def apply(parameters: PathCheckrunid, responses: `200Content171`): ParametersPathCheckrunid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCheckrunid]
  }
  
  extension [Self <: ParametersPathCheckrunid](x: Self) {
    
    inline def setParameters(value: PathCheckrunid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content171`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
