package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgidNumber extends StObject {
  
  var parameters: PathOrgidNumber
}
object ParametersPathOrgidNumber {
  
  inline def apply(parameters: PathOrgidNumber): ParametersPathOrgidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgidNumber]
  }
  
  extension [Self <: ParametersPathOrgidNumber](x: Self) {
    
    inline def setParameters(value: PathOrgidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
