package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content215 extends StObject {
  
  var parameters: PathRepoSecretname
  
  var responses: `200Content215`
}
object Responses200Content215 {
  
  inline def apply(parameters: PathRepoSecretname, responses: `200Content215`): Responses200Content215 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content215]
  }
  
  extension [Self <: Responses200Content215](x: Self) {
    
    inline def setParameters(value: PathRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content215`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
