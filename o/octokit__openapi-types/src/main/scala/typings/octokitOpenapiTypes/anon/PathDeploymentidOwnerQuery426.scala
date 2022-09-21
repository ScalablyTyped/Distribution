package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeploymentidOwnerQuery426 extends StObject {
  
  var path: DeploymentidOwner
  
  var query: `426`
}
object PathDeploymentidOwnerQuery426 {
  
  inline def apply(path: DeploymentidOwner, query: `426`): PathDeploymentidOwnerQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeploymentidOwnerQuery426]
  }
  
  extension [Self <: PathDeploymentidOwnerQuery426](x: Self) {
    
    inline def setPath(value: DeploymentidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
