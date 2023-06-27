package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters619 extends StObject {
  
  var parameters: `619`
  
  var responses: `620`
}
object Parameters619 {
  
  inline def apply(parameters: `619`, responses: `620`): Parameters619 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters619]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters619] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `619`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `620`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
