package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses224 extends StObject {
  
  var parameters: PathUsernameStringQueryPage
  
  var responses: `224`
}
object Responses224 {
  
  inline def apply(parameters: PathUsernameStringQueryPage, responses: `224`): Responses224 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses224]
  }
  
  extension [Self <: Responses224](x: Self) {
    
    inline def setParameters(value: PathUsernameStringQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `224`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
