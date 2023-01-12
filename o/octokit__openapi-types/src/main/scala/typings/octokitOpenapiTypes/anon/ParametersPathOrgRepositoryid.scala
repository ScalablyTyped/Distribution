package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRepositoryid extends StObject {
  
  var parameters: PathOrgRepositoryid
}
object ParametersPathOrgRepositoryid {
  
  inline def apply(parameters: PathOrgRepositoryid): ParametersPathOrgRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
