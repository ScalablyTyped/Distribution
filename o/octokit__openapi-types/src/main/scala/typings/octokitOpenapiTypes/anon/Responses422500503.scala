package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422500503 extends StObject {
  
  var parameters: PathPullnumberRepoQuery250
  
  var responses: `422500503`
}
object Responses422500503 {
  
  inline def apply(parameters: PathPullnumberRepoQuery250, responses: `422500503`): Responses422500503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422500503]
  }
  
  extension [Self <: Responses422500503](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepoQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422500503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
