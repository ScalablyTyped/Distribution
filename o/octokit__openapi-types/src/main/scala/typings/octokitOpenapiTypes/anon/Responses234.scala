package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses234 extends StObject {
  
  var parameters: PathDeploymentid
  
  var responses: `234`
}
object Responses234 {
  
  inline def apply(parameters: PathDeploymentid, responses: `234`): Responses234 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses234]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses234] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeploymentid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `234`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
