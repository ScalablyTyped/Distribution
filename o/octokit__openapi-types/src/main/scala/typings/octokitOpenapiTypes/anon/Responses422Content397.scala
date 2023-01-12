package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422Content397 extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `422Content397`
}
object Responses422Content397 {
  
  inline def apply(parameters: PathUsernameString, responses: `422Content397`): Responses422Content397 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422Content397]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses422Content397] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
