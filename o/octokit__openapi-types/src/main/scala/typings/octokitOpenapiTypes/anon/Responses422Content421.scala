package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422Content421 extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `422Content421`
}
object Responses422Content421 {
  
  inline def apply(parameters: PathUsernameString, responses: `422Content421`): Responses422Content421 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422Content421]
  }
  
  extension [Self <: Responses422Content421](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content421`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
