package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content167 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `200Content167`
}
object Responses200Content167 {
  
  inline def apply(parameters: PathBranch, responses: `200Content167`): Responses200Content167 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content167]
  }
  
  extension [Self <: Responses200Content167](x: Self) {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content167`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
