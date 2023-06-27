package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401Content41403ContentApplicationjsonErrors extends StObject {
  
  var parameters: PathCardidNumber
  
  var responses: `401Content41403ContentApplicationjsonErrors`
}
object Responses401Content41403ContentApplicationjsonErrors {
  
  inline def apply(parameters: PathCardidNumber, responses: `401Content41403ContentApplicationjsonErrors`): Responses401Content41403ContentApplicationjsonErrors = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401Content41403ContentApplicationjsonErrors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses401Content41403ContentApplicationjsonErrors] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCardidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content41403ContentApplicationjsonErrors`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
