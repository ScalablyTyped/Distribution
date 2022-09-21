package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQuery473 extends StObject {
  
  var parameters: PathOwnerStringQuery473
  
  var responses: `200401403404410`
}
object ParametersPathOwnerStringQuery473 {
  
  inline def apply(parameters: PathOwnerStringQuery473, responses: `200401403404410`): ParametersPathOwnerStringQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQuery473]
  }
  
  extension [Self <: ParametersPathOwnerStringQuery473](x: Self) {
    
    inline def setParameters(value: PathOwnerStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
