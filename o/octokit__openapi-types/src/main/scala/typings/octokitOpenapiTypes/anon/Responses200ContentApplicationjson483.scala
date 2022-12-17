package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson483 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200ContentApplicationjson483`
}
object Responses200ContentApplicationjson483 {
  
  inline def apply(parameters: PathOwnerString, responses: `200ContentApplicationjson483`): Responses200ContentApplicationjson483 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson483]
  }
  
  extension [Self <: Responses200ContentApplicationjson483](x: Self) {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson483`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
