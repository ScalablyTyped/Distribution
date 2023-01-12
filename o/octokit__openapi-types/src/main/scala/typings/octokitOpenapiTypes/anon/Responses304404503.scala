package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304404503 extends StObject {
  
  var parameters: PathAlertnumber
  
  var responses: `304404503`
}
object Responses304404503 {
  
  inline def apply(parameters: PathAlertnumber, responses: `304404503`): Responses304404503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304404503]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses304404503] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
