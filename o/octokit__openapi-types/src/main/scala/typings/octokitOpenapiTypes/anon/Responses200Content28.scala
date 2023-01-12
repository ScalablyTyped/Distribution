package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content28 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200Content28`
}
object Responses200Content28 {
  
  inline def apply(parameters: PathOrg, responses: `200Content28`): Responses200Content28 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content28]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content28] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content28`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
