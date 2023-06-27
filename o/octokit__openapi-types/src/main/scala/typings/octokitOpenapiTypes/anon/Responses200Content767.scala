package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content767 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200Content767`
}
object Responses200Content767 {
  
  inline def apply(parameters: PathOwnerString, responses: `200Content767`): Responses200Content767 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content767]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content767] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content767`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
