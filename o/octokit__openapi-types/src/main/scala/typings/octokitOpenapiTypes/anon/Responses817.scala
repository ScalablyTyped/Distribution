package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses817 extends StObject {
  
  var parameters: Path786Query
  
  var responses: `817`
}
object Responses817 {
  
  inline def apply(parameters: Path786Query, responses: `817`): Responses817 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses817]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses817] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path786Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `817`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
