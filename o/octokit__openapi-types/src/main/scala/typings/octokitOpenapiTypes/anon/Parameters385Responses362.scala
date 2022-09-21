package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters385Responses362 extends StObject {
  
  var parameters: `385`
  
  var responses: `362`
}
object Parameters385Responses362 {
  
  inline def apply(parameters: `385`, responses: `362`): Parameters385Responses362 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters385Responses362]
  }
  
  extension [Self <: Parameters385Responses362](x: Self) {
    
    inline def setParameters(value: `385`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `362`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
