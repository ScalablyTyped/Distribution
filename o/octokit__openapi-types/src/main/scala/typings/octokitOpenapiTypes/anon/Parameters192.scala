package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters192 extends StObject {
  
  var parameters: `192`
  
  var responses: `200304422`
}
object Parameters192 {
  
  inline def apply(parameters: `192`, responses: `200304422`): Parameters192 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters192]
  }
  
  extension [Self <: Parameters192](x: Self) {
    
    inline def setParameters(value: `192`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
