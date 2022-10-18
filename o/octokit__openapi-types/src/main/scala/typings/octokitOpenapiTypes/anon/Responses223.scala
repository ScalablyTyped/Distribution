package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses223 extends StObject {
  
  var parameters: PathUsernameStringQueryPage
  
  var responses: `223`
}
object Responses223 {
  
  inline def apply(parameters: PathUsernameStringQueryPage, responses: `223`): Responses223 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses223]
  }
  
  extension [Self <: Responses223](x: Self) {
    
    inline def setParameters(value: PathUsernameStringQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `223`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
