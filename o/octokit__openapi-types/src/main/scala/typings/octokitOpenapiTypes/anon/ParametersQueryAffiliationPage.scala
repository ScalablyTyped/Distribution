package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAffiliationPage extends StObject {
  
  var parameters: QueryAffiliationPage
  
  var responses: `200Content209`
}
object ParametersQueryAffiliationPage {
  
  inline def apply(parameters: QueryAffiliationPage, responses: `200Content209`): ParametersQueryAffiliationPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAffiliationPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryAffiliationPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryAffiliationPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content209`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
