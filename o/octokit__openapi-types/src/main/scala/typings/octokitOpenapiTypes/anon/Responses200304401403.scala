package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200304401403 extends StObject {
  
  var parameters: PathThreadid
  
  var responses: `200304401403`
}
object Responses200304401403 {
  
  inline def apply(parameters: PathThreadid, responses: `200304401403`): Responses200304401403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200304401403]
  }
  
  extension [Self <: Responses200304401403](x: Self) {
    
    inline def setParameters(value: PathThreadid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
