package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson578 extends StObject {
  
  var parameters: `416`
  
  var responses: `200ContentApplicationjson578`
}
object Responses200ContentApplicationjson578 {
  
  inline def apply(parameters: `416`, responses: `200ContentApplicationjson578`): Responses200ContentApplicationjson578 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson578]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjson578] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `416`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson578`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
