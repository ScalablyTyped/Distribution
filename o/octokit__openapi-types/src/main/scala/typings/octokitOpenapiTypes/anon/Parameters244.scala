package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters244 extends StObject {
  
  var parameters: `244`
  
  var responses: `200Content245`
}
object Parameters244 {
  
  inline def apply(parameters: `244`, responses: `200Content245`): Parameters244 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters244]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters244] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `244`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content245`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
