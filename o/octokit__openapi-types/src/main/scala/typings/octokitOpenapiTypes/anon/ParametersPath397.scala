package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath397 extends StObject {
  
  var parameters: Path397
  
  var responses: `304403404409`
}
object ParametersPath397 {
  
  inline def apply(parameters: Path397, responses: `304403404409`): ParametersPath397 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath397]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath397] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path397): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
