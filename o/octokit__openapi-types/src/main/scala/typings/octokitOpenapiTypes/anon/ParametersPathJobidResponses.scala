package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathJobidResponses extends StObject {
  
  var parameters: PathJobid
}
object ParametersPathJobidResponses {
  
  inline def apply(parameters: PathJobid): ParametersPathJobidResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathJobidResponses]
  }
  
  extension [Self <: ParametersPathJobidResponses](x: Self) {
    
    inline def setParameters(value: PathJobid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
