package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content532 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQuery407
  
  var responses: `200Content532`
}
object Responses200Content532 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQuery407, responses: `200Content532`): Responses200Content532 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content532]
  }
  
  extension [Self <: Responses200Content532](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content532`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
