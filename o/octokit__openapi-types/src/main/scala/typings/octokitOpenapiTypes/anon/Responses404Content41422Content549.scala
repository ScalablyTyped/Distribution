package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content41422Content549 extends StObject {
  
  var parameters: PathDeploymentidOwner
  
  var responses: `404Content41422Content549`
}
object Responses404Content41422Content549 {
  
  inline def apply(parameters: PathDeploymentidOwner, responses: `404Content41422Content549`): Responses404Content41422Content549 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content41422Content549]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses404Content41422Content549] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeploymentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content41422Content549`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
