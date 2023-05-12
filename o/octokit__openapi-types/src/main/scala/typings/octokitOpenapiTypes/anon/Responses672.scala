package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses672 extends StObject {
  
  var parameters: Path649Query473
  
  var responses: `672`
}
object Responses672 {
  
  inline def apply(parameters: Path649Query473, responses: `672`): Responses672 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses672]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses672] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649Query473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `672`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
