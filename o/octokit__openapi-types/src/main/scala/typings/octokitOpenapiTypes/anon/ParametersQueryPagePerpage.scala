package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpage extends StObject {
  
  var parameters: QueryPagePerpage
  
  var responses: `200ContentApplicationjsonRepositoriesTotalcount`
}
object ParametersQueryPagePerpage {
  
  inline def apply(parameters: QueryPagePerpage, responses: `200ContentApplicationjsonRepositoriesTotalcount`): ParametersQueryPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpage]
  }
  
  extension [Self <: ParametersQueryPagePerpage](x: Self) {
    
    inline def setParameters(value: QueryPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
