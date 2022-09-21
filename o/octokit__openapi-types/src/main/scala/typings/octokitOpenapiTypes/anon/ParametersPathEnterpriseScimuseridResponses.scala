package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseScimuseridResponses extends StObject {
  
  var parameters: PathEnterpriseScimuserid
}
object ParametersPathEnterpriseScimuseridResponses {
  
  inline def apply(parameters: PathEnterpriseScimuserid): ParametersPathEnterpriseScimuseridResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseScimuseridResponses]
  }
  
  extension [Self <: ParametersPathEnterpriseScimuseridResponses](x: Self) {
    
    inline def setParameters(value: PathEnterpriseScimuserid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
