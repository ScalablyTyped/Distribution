package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content208 extends StObject {
  
  var parameters: PathRepoUsername
  
  var responses: `200Content208`
}
object Responses200Content208 {
  
  inline def apply(parameters: PathRepoUsername, responses: `200Content208`): Responses200Content208 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content208]
  }
  
  extension [Self <: Responses200Content208](x: Self) {
    
    inline def setParameters(value: PathRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content208`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
