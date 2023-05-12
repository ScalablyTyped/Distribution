package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304401Content36403Content36 extends StObject {
  
  var parameters: PathProjectidNumberUsernameString
  
  var responses: `304401Content36403Content36`
}
object Responses304401Content36403Content36 {
  
  inline def apply(parameters: PathProjectidNumberUsernameString, responses: `304401Content36403Content36`): Responses304401Content36403Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304401Content36403Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses304401Content36403Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401Content36403Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
