package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content483 extends StObject {
  
  var parameters: PathOwnerRepoSecretname
  
  var responses: `200Content483`
}
object Responses200Content483 {
  
  inline def apply(parameters: PathOwnerRepoSecretname, responses: `200Content483`): Responses200Content483 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content483]
  }
  
  extension [Self <: Responses200Content483](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content483`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
