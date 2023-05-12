package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses671 extends StObject {
  
  var parameters: Path649Query473
  
  var responses: `671`
}
object Responses671 {
  
  inline def apply(parameters: Path649Query473, responses: `671`): Responses671 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses671]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses671] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649Query473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `671`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
