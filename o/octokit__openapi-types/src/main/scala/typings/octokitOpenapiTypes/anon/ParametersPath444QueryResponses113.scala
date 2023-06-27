package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath444QueryResponses113 extends StObject {
  
  var parameters: Path444Query
  
  var responses: `113`
}
object ParametersPath444QueryResponses113 {
  
  inline def apply(parameters: Path444Query, responses: `113`): ParametersPath444QueryResponses113 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath444QueryResponses113]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath444QueryResponses113] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path444Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `113`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
