package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200304401403404422 extends StObject {
  
  var parameters: PathProjectidUsername
  
  var responses: `200304401403404422`
}
object Responses200304401403404422 {
  
  inline def apply(parameters: PathProjectidUsername, responses: `200304401403404422`): Responses200304401403404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200304401403404422]
  }
  
  extension [Self <: Responses200304401403404422](x: Self) {
    
    inline def setParameters(value: PathProjectidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
