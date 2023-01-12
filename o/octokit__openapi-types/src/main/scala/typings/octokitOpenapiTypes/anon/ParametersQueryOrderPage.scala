package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryOrderPage extends StObject {
  
  var parameters: QueryOrderPage
  
  var responses: `403422503`
}
object ParametersQueryOrderPage {
  
  inline def apply(parameters: QueryOrderPage, responses: `403422503`): ParametersQueryOrderPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryOrderPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryOrderPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryOrderPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
