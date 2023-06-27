package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters251 extends StObject {
  
  var parameters: `251`
  
  var responses: `404409`
}
object Parameters251 {
  
  inline def apply(parameters: `251`, responses: `404409`): Parameters251 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters251]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters251] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `251`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
