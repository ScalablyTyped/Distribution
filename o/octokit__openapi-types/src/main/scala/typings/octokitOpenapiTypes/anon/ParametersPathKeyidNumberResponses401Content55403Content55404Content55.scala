package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKeyidNumberResponses401Content55403Content55404Content55 extends StObject {
  
  var parameters: PathKeyidNumber
  
  var responses: `401Content55403Content55404Content55`
}
object ParametersPathKeyidNumberResponses401Content55403Content55404Content55 {
  
  inline def apply(parameters: PathKeyidNumber, responses: `401Content55403Content55404Content55`): ParametersPathKeyidNumberResponses401Content55403Content55404Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKeyidNumberResponses401Content55403Content55404Content55]
  }
  
  extension [Self <: ParametersPathKeyidNumberResponses401Content55403Content55404Content55](x: Self) {
    
    inline def setParameters(value: PathKeyidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content55403Content55404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
