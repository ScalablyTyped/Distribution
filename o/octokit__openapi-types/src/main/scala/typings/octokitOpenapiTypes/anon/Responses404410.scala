package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404410 extends StObject {
  
  var parameters: Path157
  
  var responses: `404410`
}
object Responses404410 {
  
  inline def apply(parameters: Path157, responses: `404410`): Responses404410 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404410]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses404410] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path157): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
