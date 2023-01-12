package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonNameSource extends StObject {
  
  var parameters: PathNameString
  
  var responses: `200ContentApplicationjsonNameSource`
}
object Responses200ContentApplicationjsonNameSource {
  
  inline def apply(parameters: PathNameString, responses: `200ContentApplicationjsonNameSource`): Responses200ContentApplicationjsonNameSource = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonNameSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonNameSource] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNameSource`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
