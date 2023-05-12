package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters337Responses108 extends StObject {
  
  var parameters: `337`
  
  var responses: `108`
}
object Parameters337Responses108 {
  
  inline def apply(parameters: `337`, responses: `108`): Parameters337Responses108 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters337Responses108]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters337Responses108] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `337`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `108`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
