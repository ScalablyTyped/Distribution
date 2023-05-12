package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200558 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200558`
}
object Responses200558 {
  
  inline def apply(parameters: PathBranchOwner, responses: `200558`): Responses200558 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200558]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200558] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200558`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
