package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content47 extends StObject {
  
  var parameters: PathChecksuiteid
  
  var responses: `201Content47`
}
object Responses201Content47 {
  
  inline def apply(parameters: PathChecksuiteid, responses: `201Content47`): Responses201Content47 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content47]
  }
  
  extension [Self <: Responses201Content47](x: Self) {
    
    inline def setParameters(value: PathChecksuiteid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content47`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
