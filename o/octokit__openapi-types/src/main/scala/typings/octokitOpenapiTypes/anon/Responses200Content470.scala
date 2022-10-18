package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content470 extends StObject {
  
  var parameters: PathCommitshaOwnerRepoQuery250
  
  var responses: `200Content470`
}
object Responses200Content470 {
  
  inline def apply(parameters: PathCommitshaOwnerRepoQuery250, responses: `200Content470`): Responses200Content470 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content470]
  }
  
  extension [Self <: Responses200Content470](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwnerRepoQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content470`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
