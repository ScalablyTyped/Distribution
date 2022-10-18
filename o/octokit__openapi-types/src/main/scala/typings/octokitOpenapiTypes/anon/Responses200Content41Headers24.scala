package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content41Headers24 extends StObject {
  
  var parameters: QueryPerpageSince
  
  var responses: `200Content41Headers24`
}
object Responses200Content41Headers24 {
  
  inline def apply(parameters: QueryPerpageSince, responses: `200Content41Headers24`): Responses200Content41Headers24 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content41Headers24]
  }
  
  extension [Self <: Responses200Content41Headers24](x: Self) {
    
    inline def setParameters(value: QueryPerpageSince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content41Headers24`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
