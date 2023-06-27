package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses635 extends StObject {
  
  var parameters: `630`
  
  var responses: `635`
}
object Responses635 {
  
  inline def apply(parameters: `630`, responses: `635`): Responses635 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses635]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses635] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `630`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `635`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
