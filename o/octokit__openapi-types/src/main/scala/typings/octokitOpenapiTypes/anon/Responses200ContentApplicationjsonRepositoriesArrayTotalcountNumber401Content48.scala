package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48 extends StObject {
  
  var parameters: PathSecretnameString
  
  var responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48`
}
object Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48 {
  
  inline def apply(
    parameters: PathSecretnameString,
    responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48`
  ): Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretnameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
