package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content48422Content395 extends StObject {
  
  var parameters: PathDeploymentidOwner
  
  var responses: `404Content48422Content395`
}
object Responses404Content48422Content395 {
  
  inline def apply(parameters: PathDeploymentidOwner, responses: `404Content48422Content395`): Responses404Content48422Content395 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content48422Content395]
  }
  
  extension [Self <: Responses404Content48422Content395](x: Self) {
    
    inline def setParameters(value: PathDeploymentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48422Content395`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
