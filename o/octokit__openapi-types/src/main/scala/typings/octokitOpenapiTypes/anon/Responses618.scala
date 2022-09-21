package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses618 extends StObject {
  
  var parameters: Path599Query426
  
  var responses: `618`
}
object Responses618 {
  
  inline def apply(parameters: Path599Query426, responses: `618`): Responses618 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses618]
  }
  
  extension [Self <: Responses618](x: Self) {
    
    inline def setParameters(value: Path599Query426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `618`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
