package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepositoryidRunnergroupid extends StObject {
  
  var parameters: PathRepositoryidRunnergroupid
}
object ParametersPathRepositoryidRunnergroupid {
  
  inline def apply(parameters: PathRepositoryidRunnergroupid): ParametersPathRepositoryidRunnergroupid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepositoryidRunnergroupid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepositoryidRunnergroupid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepositoryidRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
