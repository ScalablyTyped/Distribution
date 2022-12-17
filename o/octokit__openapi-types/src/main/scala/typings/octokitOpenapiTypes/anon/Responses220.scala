package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses220 extends StObject {
  
  var parameters: PathDeploymentid
  
  var responses: `220`
}
object Responses220 {
  
  inline def apply(parameters: PathDeploymentid, responses: `220`): Responses220 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses220]
  }
  
  extension [Self <: Responses220](x: Self) {
    
    inline def setParameters(value: PathDeploymentid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `220`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
