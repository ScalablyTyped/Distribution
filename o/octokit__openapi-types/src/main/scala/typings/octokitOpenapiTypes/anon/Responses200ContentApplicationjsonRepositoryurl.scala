package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoryurl extends StObject {
  
  var parameters: PathThreadidNumber
  
  var responses: `200ContentApplicationjsonRepositoryurl`
}
object Responses200ContentApplicationjsonRepositoryurl {
  
  inline def apply(parameters: PathThreadidNumber, responses: `200ContentApplicationjsonRepositoryurl`): Responses200ContentApplicationjsonRepositoryurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoryurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRepositoryurl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathThreadidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoryurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
