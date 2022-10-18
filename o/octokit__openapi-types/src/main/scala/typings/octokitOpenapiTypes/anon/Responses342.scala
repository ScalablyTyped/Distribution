package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses342 extends StObject {
  
  var parameters: Path325
  
  var responses: `342`
}
object Responses342 {
  
  inline def apply(parameters: Path325, responses: `342`): Responses342 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses342]
  }
  
  extension [Self <: Responses342](x: Self) {
    
    inline def setParameters(value: Path325): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `342`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
