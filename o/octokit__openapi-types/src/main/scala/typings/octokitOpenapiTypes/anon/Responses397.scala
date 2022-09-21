package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses397 extends StObject {
  
  var parameters: Path361QueryPage
  
  var responses: `397`
}
object Responses397 {
  
  inline def apply(parameters: Path361QueryPage, responses: `397`): Responses397 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses397]
  }
  
  extension [Self <: Responses397](x: Self) {
    
    inline def setParameters(value: Path361QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
