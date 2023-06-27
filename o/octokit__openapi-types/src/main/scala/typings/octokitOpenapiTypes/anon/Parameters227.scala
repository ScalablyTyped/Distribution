package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters227 extends StObject {
  
  var parameters: `227`
  
  var responses: `200Content228`
}
object Parameters227 {
  
  inline def apply(parameters: `227`, responses: `200Content228`): Parameters227 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters227]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters227] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `227`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content228`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
