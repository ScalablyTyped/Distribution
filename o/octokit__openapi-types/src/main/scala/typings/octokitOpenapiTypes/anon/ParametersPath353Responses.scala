package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath353Responses extends StObject {
  
  var parameters: Path353
}
object ParametersPath353Responses {
  
  inline def apply(parameters: Path353): ParametersPath353Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath353Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath353Responses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path353): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
