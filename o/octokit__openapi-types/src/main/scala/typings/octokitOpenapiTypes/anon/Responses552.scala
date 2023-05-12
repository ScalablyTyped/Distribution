package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses552 extends StObject {
  
  var parameters: PathRepoWorkflowid
  
  var responses: `552`
}
object Responses552 {
  
  inline def apply(parameters: PathRepoWorkflowid, responses: `552`): Responses552 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses552]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses552] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `552`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
