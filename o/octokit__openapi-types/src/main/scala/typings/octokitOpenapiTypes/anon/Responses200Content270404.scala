package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content270404 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200Content270404`
}
object Responses200Content270404 {
  
  inline def apply(parameters: PathOwner, responses: `200Content270404`): Responses200Content270404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content270404]
  }
  
  extension [Self <: Responses200Content270404](x: Self) {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content270404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
