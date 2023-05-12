package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses416 extends StObject {
  
  var parameters: Path370QueryPage
  
  var responses: `416`
}
object Responses416 {
  
  inline def apply(parameters: Path370QueryPage, responses: `416`): Responses416 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses416]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses416] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `416`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
