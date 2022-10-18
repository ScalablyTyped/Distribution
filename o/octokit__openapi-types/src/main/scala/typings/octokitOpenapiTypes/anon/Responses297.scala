package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses297 extends StObject {
  
  var parameters: Path294
  
  var responses: `297`
}
object Responses297 {
  
  inline def apply(parameters: Path294, responses: `297`): Responses297 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses297]
  }
  
  extension [Self <: Responses297](x: Self) {
    
    inline def setParameters(value: Path294): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `297`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
