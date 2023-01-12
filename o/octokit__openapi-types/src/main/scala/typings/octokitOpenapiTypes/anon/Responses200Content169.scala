package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content169 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `200Content169`
}
object Responses200Content169 {
  
  inline def apply(parameters: PathBranch, responses: `200Content169`): Responses200Content169 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content169]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content169] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content169`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
