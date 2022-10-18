package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses488 extends StObject {
  
  var parameters: PathDeploymentidOwner
  
  var responses: `488`
}
object Responses488 {
  
  inline def apply(parameters: PathDeploymentidOwner, responses: `488`): Responses488 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses488]
  }
  
  extension [Self <: Responses488](x: Self) {
    
    inline def setParameters(value: PathDeploymentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `488`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
