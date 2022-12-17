package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content504 extends StObject {
  
  var parameters: PathOwnerRefRepoQuery407
  
  var responses: `200Content504`
}
object Responses200Content504 {
  
  inline def apply(parameters: PathOwnerRefRepoQuery407, responses: `200Content504`): Responses200Content504 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content504]
  }
  
  extension [Self <: Responses200Content504](x: Self) {
    
    inline def setParameters(value: PathOwnerRefRepoQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content504`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
