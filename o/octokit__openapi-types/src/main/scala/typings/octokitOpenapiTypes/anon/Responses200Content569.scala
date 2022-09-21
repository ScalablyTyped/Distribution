package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content569 extends StObject {
  
  var parameters: PathPullnumberRepoQuery426
  
  var responses: `200Content569`
}
object Responses200Content569 {
  
  inline def apply(parameters: PathPullnumberRepoQuery426, responses: `200Content569`): Responses200Content569 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content569]
  }
  
  extension [Self <: Responses200Content569](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepoQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content569`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
