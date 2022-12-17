package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content40 extends StObject {
  
  var parameters: PathCheckrunid
  
  var responses: `201Content40`
}
object Responses201Content40 {
  
  inline def apply(parameters: PathCheckrunid, responses: `201Content40`): Responses201Content40 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content40]
  }
  
  extension [Self <: Responses201Content40](x: Self) {
    
    inline def setParameters(value: PathCheckrunid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content40`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
