package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200180 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `200180`
}
object Responses200180 {
  
  inline def apply(parameters: PathBranch, responses: `200180`): Responses200180 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200180]
  }
  
  extension [Self <: Responses200180](x: Self) {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200180`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
