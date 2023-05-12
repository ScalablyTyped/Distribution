package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOrgStringRepositoryidNumber extends StObject {
  
  var parameters: PathNameStringOrgStringRepositoryidNumber
}
object ParametersPathNameStringOrgStringRepositoryidNumber {
  
  inline def apply(parameters: PathNameStringOrgStringRepositoryidNumber): ParametersPathNameStringOrgStringRepositoryidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOrgStringRepositoryidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameStringOrgStringRepositoryidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOrgStringRepositoryidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
