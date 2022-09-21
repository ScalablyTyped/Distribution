package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunneridNumberResponses extends StObject {
  
  var parameters: PathRunneridNumber
}
object ParametersPathRunneridNumberResponses {
  
  inline def apply(parameters: PathRunneridNumber): ParametersPathRunneridNumberResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunneridNumberResponses]
  }
  
  extension [Self <: ParametersPathRunneridNumberResponses](x: Self) {
    
    inline def setParameters(value: PathRunneridNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
