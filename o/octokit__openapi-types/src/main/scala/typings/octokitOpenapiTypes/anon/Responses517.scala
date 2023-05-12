package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses517 extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `517`
}
object Responses517 {
  
  inline def apply(parameters: PathUsernameString, responses: `517`): Responses517 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses517]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses517] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `517`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
