package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content166 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `200Content166`
}
object Responses200Content166 {
  
  inline def apply(parameters: PathBranch, responses: `200Content166`): Responses200Content166 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content166]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content166] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content166`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
