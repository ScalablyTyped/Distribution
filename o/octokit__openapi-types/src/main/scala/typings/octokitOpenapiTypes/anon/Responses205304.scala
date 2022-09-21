package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses205304 extends StObject {
  
  var parameters: PathThreadid
  
  var responses: `205304`
}
object Responses205304 {
  
  inline def apply(parameters: PathThreadid, responses: `205304`): Responses205304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses205304]
  }
  
  extension [Self <: Responses205304](x: Self) {
    
    inline def setParameters(value: PathThreadid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `205304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
