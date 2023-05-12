package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath131Responses44 extends StObject {
  
  var parameters: Path131
  
  var responses: `44`
}
object ParametersPath131Responses44 {
  
  inline def apply(parameters: Path131, responses: `44`): ParametersPath131Responses44 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath131Responses44]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath131Responses44] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path131): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `44`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
