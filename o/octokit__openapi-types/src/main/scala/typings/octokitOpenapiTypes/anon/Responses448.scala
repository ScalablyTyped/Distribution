package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses448 extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `448`
}
object Responses448 {
  
  inline def apply(parameters: PathUsernameString, responses: `448`): Responses448 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses448]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses448] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `448`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
