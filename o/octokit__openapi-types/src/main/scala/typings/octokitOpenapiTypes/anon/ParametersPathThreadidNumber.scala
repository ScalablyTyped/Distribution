package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathThreadidNumber extends StObject {
  
  var parameters: PathThreadidNumber
  
  var responses: `200ContentApplicationjsonSubject`
}
object ParametersPathThreadidNumber {
  
  inline def apply(parameters: PathThreadidNumber, responses: `200ContentApplicationjsonSubject`): ParametersPathThreadidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathThreadidNumber]
  }
  
  extension [Self <: ParametersPathThreadidNumber](x: Self) {
    
    inline def setParameters(value: PathThreadidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSubject`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
