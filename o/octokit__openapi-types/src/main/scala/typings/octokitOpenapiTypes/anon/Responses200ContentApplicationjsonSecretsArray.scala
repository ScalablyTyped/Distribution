package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonSecretsArray extends StObject {
  
  var parameters: PathOrgQuery
  
  var responses: `200ContentApplicationjsonSecretsArray`
}
object Responses200ContentApplicationjsonSecretsArray {
  
  inline def apply(parameters: PathOrgQuery, responses: `200ContentApplicationjsonSecretsArray`): Responses200ContentApplicationjsonSecretsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonSecretsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonSecretsArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSecretsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
