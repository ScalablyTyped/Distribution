package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonLanguages extends StObject {
  
  var parameters: `639`
  
  var responses: `200ContentApplicationjsonLanguages`
}
object Responses200ContentApplicationjsonLanguages {
  
  inline def apply(parameters: `639`, responses: `200ContentApplicationjsonLanguages`): Responses200ContentApplicationjsonLanguages = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonLanguages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonLanguages] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLanguages`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
