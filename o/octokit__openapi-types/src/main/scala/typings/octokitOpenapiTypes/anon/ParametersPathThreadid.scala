package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathThreadid extends StObject {
  
  var parameters: PathThreadid
  
  var responses: `304401403`
}
object ParametersPathThreadid {
  
  inline def apply(parameters: PathThreadid, responses: `304401403`): ParametersPathThreadid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathThreadid]
  }
  
  extension [Self <: ParametersPathThreadid](x: Self) {
    
    inline def setParameters(value: PathThreadid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
