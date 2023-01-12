package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403ContentApplicationjsonErrors extends StObject {
  
  var parameters: PathCardid
  
  var responses: `403ContentApplicationjsonErrors`
}
object Responses403ContentApplicationjsonErrors {
  
  inline def apply(parameters: PathCardid, responses: `403ContentApplicationjsonErrors`): Responses403ContentApplicationjsonErrors = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403ContentApplicationjsonErrors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403ContentApplicationjsonErrors] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCardid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403ContentApplicationjsonErrors`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
