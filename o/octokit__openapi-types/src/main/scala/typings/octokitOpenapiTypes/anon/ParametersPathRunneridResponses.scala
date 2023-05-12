package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunneridResponses extends StObject {
  
  var parameters: PathRunnerid
}
object ParametersPathRunneridResponses {
  
  inline def apply(parameters: PathRunnerid): ParametersPathRunneridResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunneridResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRunneridResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
