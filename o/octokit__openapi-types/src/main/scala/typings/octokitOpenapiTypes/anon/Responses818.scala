package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses818 extends StObject {
  
  var parameters: Path786Query
  
  var responses: `818`
}
object Responses818 {
  
  inline def apply(parameters: Path786Query, responses: `818`): Responses818 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses818]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses818] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path786Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `818`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
