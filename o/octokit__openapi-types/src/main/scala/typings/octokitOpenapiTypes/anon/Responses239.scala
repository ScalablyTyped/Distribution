package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses239 extends StObject {
  
  var parameters: Path325
  
  var responses: `239`
}
object Responses239 {
  
  inline def apply(parameters: Path325, responses: `239`): Responses239 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses239]
  }
  
  extension [Self <: Responses239](x: Self) {
    
    inline def setParameters(value: Path325): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `239`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
