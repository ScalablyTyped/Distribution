package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonPermissionString extends StObject {
  
  var parameters: PathProjectidNumberUsernameString
  
  var responses: `200ContentApplicationjsonPermissionString`
}
object Responses200ContentApplicationjsonPermissionString {
  
  inline def apply(
    parameters: PathProjectidNumberUsernameString,
    responses: `200ContentApplicationjsonPermissionString`
  ): Responses200ContentApplicationjsonPermissionString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonPermissionString]
  }
  
  extension [Self <: Responses200ContentApplicationjsonPermissionString](x: Self) {
    
    inline def setParameters(value: PathProjectidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonPermissionString`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
