package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDirectionPagePerpage extends StObject {
  
  var parameters: QueryDirectionPagePerpage
  
  var responses: `200Content60`
}
object ParametersQueryDirectionPagePerpage {
  
  inline def apply(parameters: QueryDirectionPagePerpage, responses: `200Content60`): ParametersQueryDirectionPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDirectionPagePerpage]
  }
  
  extension [Self <: ParametersQueryDirectionPagePerpage](x: Self) {
    
    inline def setParameters(value: QueryDirectionPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content60`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
