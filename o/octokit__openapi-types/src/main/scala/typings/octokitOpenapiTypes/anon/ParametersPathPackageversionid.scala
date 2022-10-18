package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackageversionid extends StObject {
  
  var parameters: PathPackageversionid
  
  var responses: `200ContentApplicationjsonDeletedat`
}
object ParametersPathPackageversionid {
  
  inline def apply(parameters: PathPackageversionid, responses: `200ContentApplicationjsonDeletedat`): ParametersPathPackageversionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackageversionid]
  }
  
  extension [Self <: ParametersPathPackageversionid](x: Self) {
    
    inline def setParameters(value: PathPackageversionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDeletedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
