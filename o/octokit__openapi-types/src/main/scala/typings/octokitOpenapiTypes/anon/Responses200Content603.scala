package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content603 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200Content603`
}
object Responses200Content603 {
  
  inline def apply(parameters: PathOwnerString, responses: `200Content603`): Responses200Content603 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content603]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content603] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content603`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
