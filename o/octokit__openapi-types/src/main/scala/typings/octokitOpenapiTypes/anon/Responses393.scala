package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses393 extends StObject {
  
  var parameters: Path361QueryPage
  
  var responses: `393`
}
object Responses393 {
  
  inline def apply(parameters: Path361QueryPage, responses: `393`): Responses393 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses393]
  }
  
  extension [Self <: Responses393](x: Self) {
    
    inline def setParameters(value: Path361QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `393`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
