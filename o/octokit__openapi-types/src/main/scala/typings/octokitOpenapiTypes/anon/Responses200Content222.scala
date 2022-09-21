package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content222 extends StObject {
  
  var parameters: PathRepoSecretname
  
  var responses: `200Content222`
}
object Responses200Content222 {
  
  inline def apply(parameters: PathRepoSecretname, responses: `200Content222`): Responses200Content222 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content222]
  }
  
  extension [Self <: Responses200Content222](x: Self) {
    
    inline def setParameters(value: PathRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content222`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
