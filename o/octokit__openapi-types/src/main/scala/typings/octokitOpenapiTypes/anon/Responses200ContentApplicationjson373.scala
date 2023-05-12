package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson373 extends StObject {
  
  var parameters: QueryPage
  
  var responses: `200ContentApplicationjson373`
}
object Responses200ContentApplicationjson373 {
  
  inline def apply(parameters: QueryPage, responses: `200ContentApplicationjson373`): Responses200ContentApplicationjson373 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson373]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjson373] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson373`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
