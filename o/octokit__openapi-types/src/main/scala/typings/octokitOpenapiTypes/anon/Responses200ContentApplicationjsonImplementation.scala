package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonImplementation extends StObject {
  
  var parameters: PathLicense
  
  var responses: `200ContentApplicationjsonImplementation`
}
object Responses200ContentApplicationjsonImplementation {
  
  inline def apply(parameters: PathLicense, responses: `200ContentApplicationjsonImplementation`): Responses200ContentApplicationjsonImplementation = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonImplementation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonImplementation] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathLicense): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonImplementation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
