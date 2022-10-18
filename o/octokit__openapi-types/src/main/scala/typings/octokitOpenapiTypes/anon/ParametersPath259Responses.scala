package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath259Responses extends StObject {
  
  var parameters: Path259
}
object ParametersPath259Responses {
  
  inline def apply(parameters: Path259): ParametersPath259Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath259Responses]
  }
  
  extension [Self <: ParametersPath259Responses](x: Self) {
    
    inline def setParameters(value: Path259): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
