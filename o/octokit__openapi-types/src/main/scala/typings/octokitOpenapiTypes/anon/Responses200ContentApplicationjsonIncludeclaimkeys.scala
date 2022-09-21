package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonIncludeclaimkeys extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200ContentApplicationjsonIncludeclaimkeys`
}
object Responses200ContentApplicationjsonIncludeclaimkeys {
  
  inline def apply(parameters: PathOrgString, responses: `200ContentApplicationjsonIncludeclaimkeys`): Responses200ContentApplicationjsonIncludeclaimkeys = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonIncludeclaimkeys]
  }
  
  extension [Self <: Responses200ContentApplicationjsonIncludeclaimkeys](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonIncludeclaimkeys`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
