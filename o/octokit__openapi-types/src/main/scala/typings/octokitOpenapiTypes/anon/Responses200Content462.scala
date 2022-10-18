package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content462 extends StObject {
  
  var parameters: PathOwnerRepoSecretname
  
  var responses: `200Content462`
}
object Responses200Content462 {
  
  inline def apply(parameters: PathOwnerRepoSecretname, responses: `200Content462`): Responses200Content462 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content462]
  }
  
  extension [Self <: Responses200Content462](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content462`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
