package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses464 extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `464`
}
object Responses464 {
  
  inline def apply(parameters: PathUsernameString, responses: `464`): Responses464 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses464]
  }
  
  extension [Self <: Responses464](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `464`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
