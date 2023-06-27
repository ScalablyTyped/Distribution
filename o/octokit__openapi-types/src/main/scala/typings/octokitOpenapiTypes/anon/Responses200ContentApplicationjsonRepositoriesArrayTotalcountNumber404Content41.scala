package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content41 extends StObject {
  
  var parameters: PathOrgSecretnameQuery
  
  var responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content41`
}
object Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content41 {
  
  inline def apply(
    parameters: PathOrgSecretnameQuery,
    responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content41`
  ): Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgSecretnameQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
