package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content47 extends StObject {
  
  var parameters: PathAccountid
  
  var responses: `200Content47`
}
object Responses200Content47 {
  
  inline def apply(parameters: PathAccountid, responses: `200Content47`): Responses200Content47 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content47]
  }
  
  extension [Self <: Responses200Content47](x: Self) {
    
    inline def setParameters(value: PathAccountid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content47`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
