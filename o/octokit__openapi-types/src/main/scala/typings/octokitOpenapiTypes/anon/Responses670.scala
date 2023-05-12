package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses670 extends StObject {
  
  var parameters: Path649Query473
  
  var responses: `670`
}
object Responses670 {
  
  inline def apply(parameters: Path649Query473, responses: `670`): Responses670 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses670]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses670] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649Query473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `670`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
