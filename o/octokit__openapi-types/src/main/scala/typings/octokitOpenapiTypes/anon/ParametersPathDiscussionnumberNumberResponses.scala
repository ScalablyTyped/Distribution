package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberResponses extends StObject {
  
  var parameters: PathDiscussionnumberNumber
}
object ParametersPathDiscussionnumberNumberResponses {
  
  inline def apply(parameters: PathDiscussionnumberNumber): ParametersPathDiscussionnumberNumberResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberResponses]
  }
  
  extension [Self <: ParametersPathDiscussionnumberNumberResponses](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
