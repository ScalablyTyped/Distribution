package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses345 extends StObject {
  
  var parameters: Path325
  
  var responses: `345`
}
object Responses345 {
  
  inline def apply(parameters: Path325, responses: `345`): Responses345 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses345]
  }
  
  extension [Self <: Responses345](x: Self) {
    
    inline def setParameters(value: Path325): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `345`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
