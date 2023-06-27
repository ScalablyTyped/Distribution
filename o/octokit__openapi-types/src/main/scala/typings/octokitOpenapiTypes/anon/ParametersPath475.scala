package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath475 extends StObject {
  
  var parameters: Path475
  
  var responses: `304403404409`
}
object ParametersPath475 {
  
  inline def apply(parameters: Path475, responses: `304403404409`): ParametersPath475 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath475]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath475] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path475): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
