package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath645 extends StObject {
  
  var parameters: Path645
  
  var responses: `646`
}
object ParametersPath645 {
  
  inline def apply(parameters: Path645, responses: `646`): ParametersPath645 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath645]
  }
  
  extension [Self <: ParametersPath645](x: Self) {
    
    inline def setParameters(value: Path645): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `646`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
