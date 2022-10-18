package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath319Responses extends StObject {
  
  var parameters: Path319
}
object ParametersPath319Responses {
  
  inline def apply(parameters: Path319): ParametersPath319Responses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath319Responses]
  }
  
  extension [Self <: ParametersPath319Responses](x: Self) {
    
    inline def setParameters(value: Path319): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
