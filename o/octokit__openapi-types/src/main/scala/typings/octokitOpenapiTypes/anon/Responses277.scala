package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses277 extends StObject {
  
  var parameters: PathDeploymentid
  
  var responses: `277`
}
object Responses277 {
  
  inline def apply(parameters: PathDeploymentid, responses: `277`): Responses277 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses277]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses277] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeploymentid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `277`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
