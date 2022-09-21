package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content524 extends StObject {
  
  var parameters: PathOwnerRefRepoQuery426
  
  var responses: `200Content524`
}
object Responses200Content524 {
  
  inline def apply(parameters: PathOwnerRefRepoQuery426, responses: `200Content524`): Responses200Content524 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content524]
  }
  
  extension [Self <: Responses200Content524](x: Self) {
    
    inline def setParameters(value: PathOwnerRefRepoQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content524`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
