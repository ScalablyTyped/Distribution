package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathScimuseridResponses extends StObject {
  
  var parameters: PathScimuserid
}
object ParametersPathScimuseridResponses {
  
  inline def apply(parameters: PathScimuserid): ParametersPathScimuseridResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathScimuseridResponses]
  }
  
  extension [Self <: ParametersPathScimuseridResponses](x: Self) {
    
    inline def setParameters(value: PathScimuserid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
