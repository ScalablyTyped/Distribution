package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersResponses extends StObject {
  
  var parameters: Path
  
  var responses: `201`
}
object ParametersResponses {
  
  inline def apply(parameters: Path, responses: `201`): ParametersResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
