package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringRepositoryidNumber extends StObject {
  
  var parameters: PathOrgStringRepositoryidNumber
}
object ParametersPathOrgStringRepositoryidNumber {
  
  inline def apply(parameters: PathOrgStringRepositoryidNumber): ParametersPathOrgStringRepositoryidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringRepositoryidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgStringRepositoryidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringRepositoryidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
