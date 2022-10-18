package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content531 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQuery250
  
  var responses: `200Content531`
}
object Responses200Content531 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQuery250, responses: `200Content531`): Responses200Content531 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content531]
  }
  
  extension [Self <: Responses200Content531](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content531`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
