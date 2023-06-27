package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200215 extends StObject {
  
  var parameters: PathBranch
  
  var responses: `200215`
}
object Responses200215 {
  
  inline def apply(parameters: PathBranch, responses: `200215`): Responses200215 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200215]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200215] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200215`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
