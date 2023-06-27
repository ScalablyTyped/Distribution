package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses811 extends StObject {
  
  var parameters: Path786Query
  
  var responses: `811`
}
object Responses811 {
  
  inline def apply(parameters: Path786Query, responses: `811`): Responses811 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses811]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses811] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path786Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `811`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
