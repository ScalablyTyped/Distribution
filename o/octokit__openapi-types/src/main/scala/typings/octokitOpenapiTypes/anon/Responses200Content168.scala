package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content168 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `200Content168`
}
object Responses200Content168 {
  
  inline def apply(parameters: PathBranch, responses: `200Content168`): Responses200Content168 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content168]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content168] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content168`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
