package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses62 extends StObject {
  
  var parameters: PathThreadid
  
  var responses: `62`
}
object Responses62 {
  
  inline def apply(parameters: PathThreadid, responses: `62`): Responses62 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses62]
  }
  
  extension [Self <: Responses62](x: Self) {
    
    inline def setParameters(value: PathThreadid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `62`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
