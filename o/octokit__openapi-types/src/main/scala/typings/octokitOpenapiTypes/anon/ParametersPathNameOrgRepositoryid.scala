package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameOrgRepositoryid extends StObject {
  
  var parameters: PathNameOrgRepositoryid
}
object ParametersPathNameOrgRepositoryid {
  
  inline def apply(parameters: PathNameOrgRepositoryid): ParametersPathNameOrgRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameOrgRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameOrgRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameOrgRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
