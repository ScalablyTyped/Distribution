package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content598 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQuery473
  
  var responses: `200Content598`
}
object Responses200Content598 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQuery473, responses: `200Content598`): Responses200Content598 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content598]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content598] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content598`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
