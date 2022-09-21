package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content176 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `200Content176`
}
object Responses200Content176 {
  
  inline def apply(parameters: PathBranch, responses: `200Content176`): Responses200Content176 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content176]
  }
  
  extension [Self <: Responses200Content176](x: Self) {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content176`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
