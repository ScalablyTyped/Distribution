package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content69 extends StObject {
  
  var parameters: `55`
  
  var responses: `200Content69`
}
object Responses200Content69 {
  
  inline def apply(parameters: `55`, responses: `200Content69`): Responses200Content69 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content69]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content69] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `55`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content69`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
