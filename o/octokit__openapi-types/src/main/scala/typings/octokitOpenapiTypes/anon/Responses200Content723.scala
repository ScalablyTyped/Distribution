package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content723 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200Content723`
}
object Responses200Content723 {
  
  inline def apply(parameters: PathOwnerString, responses: `200Content723`): Responses200Content723 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content723]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content723] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content723`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
