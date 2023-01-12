package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses381 extends StObject {
  
  var parameters: Path348QueryPage
  
  var responses: `381`
}
object Responses381 {
  
  inline def apply(parameters: Path348QueryPage, responses: `381`): Responses381 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses381]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses381] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path348QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `381`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
