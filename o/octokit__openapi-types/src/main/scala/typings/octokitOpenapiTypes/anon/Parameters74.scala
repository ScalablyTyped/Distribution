package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters74 extends StObject {
  
  var parameters: `74`
  
  var responses: `500`
}
object Parameters74 {
  
  inline def apply(parameters: `74`, responses: `500`): Parameters74 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters74]
  }
  
  extension [Self <: Parameters74](x: Self) {
    
    inline def setParameters(value: `74`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
