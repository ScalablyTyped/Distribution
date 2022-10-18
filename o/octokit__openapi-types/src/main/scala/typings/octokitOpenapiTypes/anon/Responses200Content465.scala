package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content465 extends StObject {
  
  var parameters: PathOwnerRepoUsername
  
  var responses: `200Content465`
}
object Responses200Content465 {
  
  inline def apply(parameters: PathOwnerRepoUsername, responses: `200Content465`): Responses200Content465 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content465]
  }
  
  extension [Self <: Responses200Content465](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content465`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
