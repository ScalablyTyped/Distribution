package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryFilterPage extends StObject {
  
  var parameters: QueryFilterPage
  
  var responses: `200Content41Headers`
}
object ParametersQueryFilterPage {
  
  inline def apply(parameters: QueryFilterPage, responses: `200Content41Headers`): ParametersQueryFilterPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryFilterPage]
  }
  
  extension [Self <: ParametersQueryFilterPage](x: Self) {
    
    inline def setParameters(value: QueryFilterPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content41Headers`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
