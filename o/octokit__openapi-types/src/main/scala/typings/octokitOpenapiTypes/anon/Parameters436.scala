package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters436 extends StObject {
  
  var parameters: `436`
  
  var responses: `200304422`
}
object Parameters436 {
  
  inline def apply(parameters: `436`, responses: `200304422`): Parameters436 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters436]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters436] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `436`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
