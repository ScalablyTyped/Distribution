package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypePackageversionid extends StObject {
  
  var parameters: PathPackagetypePackageversionid
  
  var responses: `200ContentApplicationjsonDeletedat`
}
object ParametersPathPackagetypePackageversionid {
  
  inline def apply(parameters: PathPackagetypePackageversionid, responses: `200ContentApplicationjsonDeletedat`): ParametersPathPackagetypePackageversionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypePackageversionid]
  }
  
  extension [Self <: ParametersPathPackagetypePackageversionid](x: Self) {
    
    inline def setParameters(value: PathPackagetypePackageversionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDeletedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
