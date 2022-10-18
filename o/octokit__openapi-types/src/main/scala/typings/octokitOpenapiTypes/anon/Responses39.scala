package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses39 extends StObject {
  
  var parameters: QueryPagePerpage
  
  var responses: `39`
}
object Responses39 {
  
  inline def apply(parameters: QueryPagePerpage, responses: `39`): Responses39 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses39]
  }
  
  extension [Self <: Responses39](x: Self) {
    
    inline def setParameters(value: QueryPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `39`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
