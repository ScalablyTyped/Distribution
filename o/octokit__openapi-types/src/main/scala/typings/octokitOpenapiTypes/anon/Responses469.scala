package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses469 extends StObject {
  
  var parameters: PathOrgStringQuery426
  
  var responses: `469`
}
object Responses469 {
  
  inline def apply(parameters: PathOrgStringQuery426, responses: `469`): Responses469 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses469]
  }
  
  extension [Self <: Responses469](x: Self) {
    
    inline def setParameters(value: PathOrgStringQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `469`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
