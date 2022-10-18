package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content258 extends StObject {
  
  var parameters: Path246
  
  var responses: `201Content258`
}
object Responses201Content258 {
  
  inline def apply(parameters: Path246, responses: `201Content258`): Responses201Content258 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content258]
  }
  
  extension [Self <: Responses201Content258](x: Self) {
    
    inline def setParameters(value: Path246): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content258`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
