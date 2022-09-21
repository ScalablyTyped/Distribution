package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryOrderPagePerpage extends StObject {
  
  var parameters: QueryOrderPagePerpage
  
  var responses: `200304422503`
}
object ParametersQueryOrderPagePerpage {
  
  inline def apply(parameters: QueryOrderPagePerpage, responses: `200304422503`): ParametersQueryOrderPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryOrderPagePerpage]
  }
  
  extension [Self <: ParametersQueryOrderPagePerpage](x: Self) {
    
    inline def setParameters(value: QueryOrderPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
