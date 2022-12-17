package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses349 extends StObject {
  
  var parameters: Path348
  
  var responses: `349`
}
object Responses349 {
  
  inline def apply(parameters: Path348, responses: `349`): Responses349 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses349]
  }
  
  extension [Self <: Responses349](x: Self) {
    
    inline def setParameters(value: Path348): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `349`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
