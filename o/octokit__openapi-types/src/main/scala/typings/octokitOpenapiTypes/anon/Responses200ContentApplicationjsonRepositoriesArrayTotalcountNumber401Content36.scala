package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content36 extends StObject {
  
  var parameters: Path652
  
  var responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content36`
}
object Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content36 {
  
  inline def apply(
    parameters: Path652,
    responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content36`
  ): Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path652): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
