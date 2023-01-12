package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202304 extends StObject {
  
  var parameters: Path356
  
  var responses: `202304`
}
object Responses202304 {
  
  inline def apply(parameters: Path356, responses: `202304`): Responses202304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202304] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path356): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
