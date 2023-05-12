package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content36 extends StObject {
  
  var parameters: Query507
  
  var responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content36`
}
object Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content36 {
  
  inline def apply(
    parameters: Query507,
    responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content36`
  ): Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query507): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
