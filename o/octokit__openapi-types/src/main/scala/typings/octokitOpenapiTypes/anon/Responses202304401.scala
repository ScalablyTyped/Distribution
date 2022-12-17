package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202304401 extends StObject {
  
  var parameters: PathCodespacenameString
  
  var responses: `202304401`
}
object Responses202304401 {
  
  inline def apply(parameters: PathCodespacenameString, responses: `202304401`): Responses202304401 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202304401]
  }
  
  extension [Self <: Responses202304401](x: Self) {
    
    inline def setParameters(value: PathCodespacenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202304401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
