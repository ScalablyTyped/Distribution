package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAnonPage extends StObject {
  
  var parameters: QueryAnonPage
  
  var responses: `200Content506`
}
object ParametersQueryAnonPage {
  
  inline def apply(parameters: QueryAnonPage, responses: `200Content506`): ParametersQueryAnonPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAnonPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryAnonPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryAnonPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content506`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
