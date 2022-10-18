package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses221 extends StObject {
  
  var parameters: PathUsernameStringQueryPage
  
  var responses: `221`
}
object Responses221 {
  
  inline def apply(parameters: PathUsernameStringQueryPage, responses: `221`): Responses221 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses221]
  }
  
  extension [Self <: Responses221](x: Self) {
    
    inline def setParameters(value: PathUsernameStringQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `221`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
