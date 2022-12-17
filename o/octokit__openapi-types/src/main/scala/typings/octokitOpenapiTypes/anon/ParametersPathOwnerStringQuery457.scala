package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQuery457 extends StObject {
  
  var parameters: PathOwnerStringQuery457
  
  var responses: `200401403404410`
}
object ParametersPathOwnerStringQuery457 {
  
  inline def apply(parameters: PathOwnerStringQuery457, responses: `200401403404410`): ParametersPathOwnerStringQuery457 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQuery457]
  }
  
  extension [Self <: ParametersPathOwnerStringQuery457](x: Self) {
    
    inline def setParameters(value: PathOwnerStringQuery457): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
