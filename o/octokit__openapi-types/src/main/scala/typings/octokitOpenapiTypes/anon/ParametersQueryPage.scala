package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPage extends StObject {
  
  var parameters: QueryPage
  
  var responses: `200ContentApplicationjsonOrganizations`
}
object ParametersQueryPage {
  
  inline def apply(parameters: QueryPage, responses: `200ContentApplicationjsonOrganizations`): ParametersQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOrganizations`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
