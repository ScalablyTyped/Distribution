package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjson589 extends StObject {
  
  var parameters: PathOrgStringQuery
  
  var responses: `200ContentApplicationjson589`
}
object Responses200ContentApplicationjson589 {
  
  inline def apply(parameters: PathOrgStringQuery, responses: `200ContentApplicationjson589`): Responses200ContentApplicationjson589 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjson589]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjson589] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson589`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
