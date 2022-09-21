package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryFilterPagePerpage extends StObject {
  
  var parameters: QueryFilterPagePerpage
  
  var responses: `160`
}
object ParametersQueryFilterPagePerpage {
  
  inline def apply(parameters: QueryFilterPagePerpage, responses: `160`): ParametersQueryFilterPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryFilterPagePerpage]
  }
  
  extension [Self <: ParametersQueryFilterPagePerpage](x: Self) {
    
    inline def setParameters(value: QueryFilterPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `160`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
