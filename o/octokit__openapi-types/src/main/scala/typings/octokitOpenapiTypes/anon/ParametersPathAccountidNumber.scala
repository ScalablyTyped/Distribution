package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAccountidNumber extends StObject {
  
  var parameters: PathAccountidNumber
  
  var responses: `200401`
}
object ParametersPathAccountidNumber {
  
  inline def apply(parameters: PathAccountidNumber, responses: `200401`): ParametersPathAccountidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAccountidNumber]
  }
  
  extension [Self <: ParametersPathAccountidNumber](x: Self) {
    
    inline def setParameters(value: PathAccountidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
