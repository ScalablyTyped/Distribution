package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200662 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200662`
}
object Responses200662 {
  
  inline def apply(parameters: PathBranchOwner, responses: `200662`): Responses200662 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200662]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200662] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200662`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
