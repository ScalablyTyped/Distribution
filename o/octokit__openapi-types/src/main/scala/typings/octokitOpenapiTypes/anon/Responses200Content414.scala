package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content414 extends StObject {
  
  var parameters: Path370QueryPage
  
  var responses: `200Content414`
}
object Responses200Content414 {
  
  inline def apply(parameters: Path370QueryPage, responses: `200Content414`): Responses200Content414 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content414]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content414] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content414`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
