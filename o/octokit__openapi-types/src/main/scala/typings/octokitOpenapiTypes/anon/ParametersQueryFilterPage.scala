package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryFilterPage extends StObject {
  
  var parameters: QueryFilterPage
  
  var responses: `102`
}
object ParametersQueryFilterPage {
  
  inline def apply(parameters: QueryFilterPage, responses: `102`): ParametersQueryFilterPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryFilterPage]
  }
  
  extension [Self <: ParametersQueryFilterPage](x: Self) {
    
    inline def setParameters(value: QueryFilterPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `102`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
