package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson214 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200ContentApplicationjson214`
}
object Responses200ContentApplicationjson214 {
  
  inline def apply(parameters: PathOwner, responses: `200ContentApplicationjson214`): Responses200ContentApplicationjson214 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson214]
  }
  
  extension [Self <: Responses200ContentApplicationjson214](x: Self) {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson214`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
