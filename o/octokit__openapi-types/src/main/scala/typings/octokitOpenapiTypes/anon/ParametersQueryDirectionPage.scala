package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDirectionPage extends StObject {
  
  var parameters: QueryDirectionPage
  
  var responses: `200Content116`
}
object ParametersQueryDirectionPage {
  
  inline def apply(parameters: QueryDirectionPage, responses: `200Content116`): ParametersQueryDirectionPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDirectionPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryDirectionPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryDirectionPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content116`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
