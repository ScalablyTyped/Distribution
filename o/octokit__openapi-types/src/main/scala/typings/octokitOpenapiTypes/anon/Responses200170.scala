package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200170 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `200170`
}
object Responses200170 {
  
  inline def apply(parameters: PathBranch, responses: `200170`): Responses200170 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200170]
  }
  
  extension [Self <: Responses200170](x: Self) {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200170`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
