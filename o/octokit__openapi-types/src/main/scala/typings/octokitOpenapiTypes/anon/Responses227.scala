package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses227 extends StObject {
  
  var parameters: PathDeploymentid
  
  var responses: `227`
}
object Responses227 {
  
  inline def apply(parameters: PathDeploymentid, responses: `227`): Responses227 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses227]
  }
  
  extension [Self <: Responses227](x: Self) {
    
    inline def setParameters(value: PathDeploymentid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `227`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
