package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryBeforePage extends StObject {
  
  var parameters: QueryBeforePage
  
  var responses: `544`
}
object ParametersQueryBeforePage {
  
  inline def apply(parameters: QueryBeforePage, responses: `544`): ParametersQueryBeforePage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryBeforePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryBeforePage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryBeforePage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `544`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
