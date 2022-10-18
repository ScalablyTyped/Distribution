package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses391 extends StObject {
  
  var parameters: Path390
  
  var responses: `391`
}
object Responses391 {
  
  inline def apply(parameters: Path390, responses: `391`): Responses391 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses391]
  }
  
  extension [Self <: Responses391](x: Self) {
    
    inline def setParameters(value: Path390): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `391`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
