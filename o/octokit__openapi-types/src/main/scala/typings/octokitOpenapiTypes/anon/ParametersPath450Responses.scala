package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath450Responses extends StObject {
  
  var parameters: Path450
}
object ParametersPath450Responses {
  
  inline def apply(parameters: Path450): ParametersPath450Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath450Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath450Responses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path450): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
