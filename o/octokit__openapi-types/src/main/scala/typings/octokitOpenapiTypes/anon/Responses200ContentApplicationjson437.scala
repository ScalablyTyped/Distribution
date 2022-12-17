package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson437 extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200ContentApplicationjson437`
}
object Responses200ContentApplicationjson437 {
  
  inline def apply(parameters: PathOrgString, responses: `200ContentApplicationjson437`): Responses200ContentApplicationjson437 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson437]
  }
  
  extension [Self <: Responses200ContentApplicationjson437](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson437`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
