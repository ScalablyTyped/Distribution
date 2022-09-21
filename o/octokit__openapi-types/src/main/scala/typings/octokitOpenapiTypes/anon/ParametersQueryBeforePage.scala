package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryBeforePage extends StObject {
  
  var parameters: QueryBeforePage
  
  var responses: `563`
}
object ParametersQueryBeforePage {
  
  inline def apply(parameters: QueryBeforePage, responses: `563`): ParametersQueryBeforePage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryBeforePage]
  }
  
  extension [Self <: ParametersQueryBeforePage](x: Self) {
    
    inline def setParameters(value: QueryBeforePage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `563`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
