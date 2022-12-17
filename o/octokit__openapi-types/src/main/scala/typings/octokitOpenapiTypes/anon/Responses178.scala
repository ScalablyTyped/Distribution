package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses178 extends StObject {
  
  var parameters: PathChecksuiteid
  
  var responses: `178`
}
object Responses178 {
  
  inline def apply(parameters: PathChecksuiteid, responses: `178`): Responses178 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses178]
  }
  
  extension [Self <: Responses178](x: Self) {
    
    inline def setParameters(value: PathChecksuiteid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `178`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
