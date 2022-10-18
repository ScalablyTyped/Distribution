package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404410 extends StObject {
  
  var parameters: PathProjectidNumber
  
  var responses: `404410`
}
object Responses404410 {
  
  inline def apply(parameters: PathProjectidNumber, responses: `404410`): Responses404410 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404410]
  }
  
  extension [Self <: Responses404410](x: Self) {
    
    inline def setParameters(value: PathProjectidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
