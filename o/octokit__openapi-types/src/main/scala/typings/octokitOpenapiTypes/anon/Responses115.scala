package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses115 extends StObject {
  
  var parameters: PathPackagename
  
  var responses: `115`
}
object Responses115 {
  
  inline def apply(parameters: PathPackagename, responses: `115`): Responses115 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses115]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses115] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagename): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `115`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
