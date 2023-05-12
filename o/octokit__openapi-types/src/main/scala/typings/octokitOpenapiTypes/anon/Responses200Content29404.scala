package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content29404 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `200Content29404`
}
object Responses200Content29404 {
  
  inline def apply(parameters: PathBranch, responses: `200Content29404`): Responses200Content29404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content29404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content29404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content29404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
