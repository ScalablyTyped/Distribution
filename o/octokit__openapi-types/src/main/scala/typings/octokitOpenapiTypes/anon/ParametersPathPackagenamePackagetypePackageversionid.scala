package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypePackageversionid extends StObject {
  
  var parameters: PathPackagenamePackagetypePackageversionid
  
  var responses: `401403404`
}
object ParametersPathPackagenamePackagetypePackageversionid {
  
  inline def apply(parameters: PathPackagenamePackagetypePackageversionid, responses: `401403404`): ParametersPathPackagenamePackagetypePackageversionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypePackageversionid]
  }
  
  extension [Self <: ParametersPathPackagenamePackagetypePackageversionid](x: Self) {
    
    inline def setParameters(value: PathPackagenamePackagetypePackageversionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
