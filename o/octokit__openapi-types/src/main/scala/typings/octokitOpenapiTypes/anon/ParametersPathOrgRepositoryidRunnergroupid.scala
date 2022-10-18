package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRepositoryidRunnergroupid extends StObject {
  
  var parameters: PathOrgRepositoryidRunnergroupid
}
object ParametersPathOrgRepositoryidRunnergroupid {
  
  inline def apply(parameters: PathOrgRepositoryidRunnergroupid): ParametersPathOrgRepositoryidRunnergroupid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRepositoryidRunnergroupid]
  }
  
  extension [Self <: ParametersPathOrgRepositoryidRunnergroupid](x: Self) {
    
    inline def setParameters(value: PathOrgRepositoryidRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
