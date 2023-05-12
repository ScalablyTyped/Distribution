package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200181 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `200181`
}
object Responses200181 {
  
  inline def apply(parameters: PathBranch, responses: `200181`): Responses200181 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200181]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200181] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200181`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
