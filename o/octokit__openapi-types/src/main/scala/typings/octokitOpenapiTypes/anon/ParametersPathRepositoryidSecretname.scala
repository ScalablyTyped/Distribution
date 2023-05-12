package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepositoryidSecretname extends StObject {
  
  var parameters: PathRepositoryidSecretname
}
object ParametersPathRepositoryidSecretname {
  
  inline def apply(parameters: PathRepositoryidSecretname): ParametersPathRepositoryidSecretname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepositoryidSecretname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepositoryidSecretname] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepositoryidSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
