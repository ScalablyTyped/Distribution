package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses195 extends StObject {
  
  var parameters: PathWorkflowid
  
  var responses: `195`
}
object Responses195 {
  
  inline def apply(parameters: PathWorkflowid, responses: `195`): Responses195 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses195]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses195] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `195`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
